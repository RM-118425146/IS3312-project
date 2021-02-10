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
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author be_me
 */
public class ProductDAO {

    /* Gets number of top products specified */
 /* we are gonna fake this one */
    public ArrayList<Product> getTopProducts() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int productId = 0;
        String name = null;
        String itemCode = null;
        String description = null;
        String category = null;
        float price = 0.0f;
        String imageLocation = null;

        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                productId = (rs.getInt(1));
                name = (rs.getString(2));
                itemCode = (rs.getString(3));
                description = (rs.getString(4));
                category = (rs.getString(5));
                price = (rs.getFloat(6));
                imageLocation = (rs.getString(7));
                Product product = new Product();
                product.setId(productId);
                product.setName(name);
                product.setitemCode(itemCode);
                product.setDescription(description);
                product.setCategory(category);
                product.setPrice(price);
                product.setImageLocation(imageLocation);
                productData.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productData;

    }

    public Product getProductCode(int productCode) {
        DBManager dbmgr = new DBManager();
        Connection con = dbmgr.getConnection();

        String Name = null;
        String ItemCode = null;
        String Description = null;
        String category = null;
        Float Price = null;
        String ImageLocation = null;
        Product tempProduct = new Product();

        String query = String.format("SELECT * FROM PRODUCTS WHERE PRODUCT_ID=%d", productCode);

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Name = (rs.getString(2));
                ItemCode = (rs.getString(3));
                Description = (rs.getString(4));
                category = (rs.getString(5));
                Price = (rs.getFloat(6));
                ImageLocation = (rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        tempProduct.setId(productCode);
        tempProduct.setName(Name);
        tempProduct.setDescription(Description);
        tempProduct.setitemCode(ItemCode);
        tempProduct.setCategory(category);
        tempProduct.setPrice(Price);
        tempProduct.setImageLocation(ImageLocation);
        return tempProduct;

    }

    public Product getProductCode(String productCode) {
        DBManager dbmgr = new DBManager();
        Connection con = dbmgr.getConnection();

        long ID = 0;
        String Name = null;
        String Description = null;
        Float Price = null;
        String ImageLocation = null;
        Product tempProduct = new Product();

        String query = String.format("SELECT * FROM PRODUCTS WHERE ITEMCODE='%s'", productCode);

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ID = (rs.getLong(1));
                Name = (rs.getString(2));
                Description = (rs.getString(4));
                Price = (rs.getFloat(6));
                ImageLocation = (rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        tempProduct.setId(ID);
        tempProduct.setName(Name);
        tempProduct.setDescription(Description);
        tempProduct.setitemCode(productCode);
        tempProduct.setPrice(Price);
        tempProduct.setImageLocation(ImageLocation);
        return tempProduct;

    }

    public ArrayList<Product> getAllProducts() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();

        long ID = 0;
        String Name = null;
        String ItemCode = null;
        String Description = null;
        Float Price = null;
        String ImageLocation = null;

        ArrayList<Product> productData = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ID = (rs.getLong(1));
                Name = (rs.getString(2));
                ItemCode = (rs.getString(3));
                Description = (rs.getString(4));
                Price = (rs.getFloat(6));
                ImageLocation = (rs.getString(7));
                Product tempProduct = new Product();
                tempProduct.setId(ID);
                tempProduct.setName(Name);
                tempProduct.setDescription(Description);
                tempProduct.setitemCode(ItemCode);
                tempProduct.setPrice(Price);
                tempProduct.setImageLocation(ImageLocation);
                productData.add(tempProduct);
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
            String sql = String.format("INSERT INTO PRODUCTS(NAME, ITEMCODE, DESCRIPTION, CATEGORY, PRICE, IMAGELOCATION)"
                    + "VALUES('%s', '%s', '%s', %s, %s, '%s')", newProduct.getName(), newProduct.getitemCode(), newProduct.getDescription(), newProduct.getCategory(), newProduct.getPrice(), newProduct.getImageLocation());
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
            String sql = String.format("UPDATE PRODUCTS SET NAME='%s', ITEMCODE='%s', DESCRIPTION='%s', CATEGORY='%s', PRICE=%s, IMAGELOCATION='%s' where PRODUCT_ID=%d",
                    newProduct.getName(), newProduct.getitemCode(), newProduct.getDescription(), newProduct.getCategory(), newProduct.getPrice(), newProduct.getImageLocation(), newProduct.getId());
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

    public void deleteProduct(Integer productCode) {

        DBManager dmbgr = new DBManager();
        Connection con = dmbgr.getConnection();
        Statement stmt = null;

        try {

            stmt = con.createStatement();
            String sql = String.format("DELETE FROM PRODUCTS WHERE PRODUCT_ID=%d", productCode);
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

    public ArrayList<String> getCategories() {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();

        String category = null;

        ArrayList<String> categories = new ArrayList();

        String query = "SELECT * FROM PRODUCTS";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                category = (rs.getString(5));
                if (categories.contains(category) == false) {
                    categories.add(category);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categories;

    }
    
    public ArrayList<Product> getCategoryProducts(String Category) {

        DBManager dm = new DBManager();
        Connection con = dm.getConnection();
        int productId = 0;
        String name = null;
        String itemCode = null;
        String description = null;
        float price = 0.0f;
        String imageLocation = null;

        ArrayList<Product> productData = new ArrayList();

        String query = String.format( "SELECT * FROM PRODUCTS WHERE CATEGORY='%s'", Category);
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                productId = (rs.getInt(1));
                name = (rs.getString(2));
                itemCode = (rs.getString(3));
                description = (rs.getString(4));
                price = (rs.getFloat(6));
                imageLocation = (rs.getString(7));
                Product product = new Product();
                product.setId(productId);
                product.setName(name);
                product.setitemCode(itemCode);
                product.setDescription(description);
                product.setPrice(price);
                product.setImageLocation(imageLocation);
                productData.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productData;

    }

}
