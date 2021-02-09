/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.*;
import Data.*;
import Service.*;
import Utils.*;

/**
 *
 * @author be_me
 */
public class ProductDAO {
    
    /* Gets number of top products specified */
    /* we are gonna fake this one */
    public ArrayList<Product> getTopProducts(int numProducts){
        
        
        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int productId = 0;
        String name = null;
        String itemCode = null;
        String description = null;
        float price = 0.0f;
        String imageLocation = null;

        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            int productCount = 0;
            while (rs.next()) {
                if (productCount >= numProducts)
                    break;
                productId = (rs.getInt(1));
                name = (rs.getString(2));
                itemCode = (rs.getString(3));
                description = (rs.getString(4));
                price = (rs.getFloat(5));
                imageLocation = (rs.getString(6));
                Product product = new Product();
                product.setId(productId);
                product.setName(name);
                product.setitemCode(itemCode);               
                product.setDescription(description);
                product.setPrice(price);
                product.setImageLocation(imageLocation);
                productData.add(product);
                productCount++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

      
        return productData;
        
         
        
    }
    
    public Product getProductCode(String productCode) throws SQLException {
        DBManager dbmgr = new DBManager();
        Connection con = dbmgr.getConnection();

        String Name = null;
        String ItemCode = null;
        String Description = null;
        String Price = null;
        String ImageLocation = null;

        String query = String.format("SELECT * FROM PRODUCTS WHERE PRODUCT_ID=%d", productCode);

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Name = (rs.getString(2));
                ItemCode = (rs.getString(3));
                Description = (rs.getString(4));
                Price = (rs.getString(5));
                ImageLocation = (rs.getString(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    public ArrayList<Product> getAllProducts() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();

        String Name = null;
        String ItemCode = null;
        String Description = null;
        String Price = null;
        String ImageLocation = null;

        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Name = (rs.getString(2));
                ItemCode = (rs.getString(3));
                Description = (rs.getString(4));
                Price = (rs.getString(5));
                ImageLocation = (rs.getString(6));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productData;

    }

    public void insertProduct(Product newProduct) {
        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;

        try {
            stmt = con.createStatement();
            String sql = String.format("INSERT INTO PRODUCTS(NAME, ITEMCODE, DESCRIPTION, PRICE, IMAGELOCATION)"
                    + "VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')", newProduct.getName(), newProduct.getitemCode(), newProduct.getDescription(), newProduct.getPrice(), newProduct.getImageLocation());
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void updateProduct(Product newProduct) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;

        try {

            stmt = con.createStatement();
            String sql = String.format("UPDATE PRODUCTS SET NAME='%s', ITEMCODE='%s', DESCRIPTION='%s', PRICE='%s', IMAGELOCATION='%s' where PRODUCT_CODE=%d", 
                    newProduct.getName(), newProduct.getitemCode(), newProduct.getDescription(), newProduct.getPrice(),  newProduct.getImageLocation());
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteProduct(String productCode) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;

        try {

            stmt = con.createStatement();
            String sql = String.format("DELETE FROM PRODUCTS WHERE PRODUCT_CODE=%d", productCode);
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    
}
