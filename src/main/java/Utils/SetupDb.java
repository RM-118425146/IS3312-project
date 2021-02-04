/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BEmerson
 */
public class SetupDb {

    Logger logger = Logger.getLogger(DBManager.class.getName());

    public void createTables() {

        DBManager dmbgr = new DBManager();

        Connection con = dmbgr.getConnection();

        InputStream inpStr = null;

        try {
            inpStr = SetupDb.class.getClassLoader().getResourceAsStream("createdb.sql");
        } catch (Exception e) {
            System.out.println(e);
        }

        executeSqlScript(con, inpStr);
    }

    public void insertSetupData() {

        DBManager dmbgr = new DBManager();

        Connection con = dmbgr.getConnection();

        InputStream inpStr = null;
        try {
            inpStr = SetupDb.class.getClassLoader().getResourceAsStream("insertdata.sql");
        } catch (Exception e) {
            System.out.println(e);
        }

        executeSqlScript(con, inpStr);
    }

    public void showData() {

        Statement stmt;

        DBManager dmbgr = new DBManager();

        Connection con = dmbgr.getConnection();

        try {
            stmt = con.createStatement();
            ResultSet results = stmt.executeQuery("select * from USERDATA");

            System.out.println("\n-------------------------------------------------");

            while (results.next()) {
                int id = results.getInt(1);
                String email = results.getString(2);
                String password = results.getString(3);
                String fName = results.getString(4);
                String lName = results.getString(5);
                String userType = results.getString(6);
                logger.info(id + "\t\t" + email + "\t\t" + password + "\t\t" + fName + "\t\t" + lName + "\t\t" + userType);
            }
            results.close();
            stmt.close();
        } catch (SQLException sqlExcept) {
            logger.log(Level.SEVERE, null, sqlExcept);
        }

        try {
            stmt = con.createStatement();
            ResultSet results = stmt.executeQuery("select * from PRODUCTS");

            System.out.println("\n-------------------------------------------------");

            while (results.next()) {
                int id = results.getInt(1);
                String name = results.getString(2);
                String itemCode = results.getString(3);
                String description = results.getString(4);
                float price = results.getFloat(5);
                String imageLocation = results.getString(6);
                logger.info(id + "\t\t" + name + "\t\t" + itemCode + "\t\t" + description + "\t\t" + price + "\t\t" + imageLocation);
            }
            results.close();
            stmt.close();
        } catch (SQLException sqlExcept) {
            logger.log(Level.SEVERE, null, sqlExcept);
        }

    }

    public void executeSqlScript(Connection conn, InputStream inputStream) {

        // Delimiter
        String delimiter = ";";

        // Create scanner
        Scanner scanner;

        scanner = new Scanner(inputStream).useDelimiter(delimiter);

        // Loop through the SQL file statements 
        Statement currentStatement = null;
        while (scanner.hasNext()) {

            // Get statement 
            String rawStatement = scanner.next();
            try {
                // Execute statement
                currentStatement = conn.createStatement();
                currentStatement.execute(rawStatement);
            } catch (SQLException e) {
                logger.log(Level.SEVERE, null, e);
            } finally {
                // Release resources
                if (currentStatement != null) {
                    try {
                        currentStatement.close();
                    } catch (SQLException e) {
                        logger.log(Level.SEVERE, null, e);;
                    }
                }
                currentStatement = null;
            }
        }
    }

}
