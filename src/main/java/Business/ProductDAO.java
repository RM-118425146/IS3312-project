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
import java.util.ArrayList;
import java.util.Vector;
import Model.*;
import Utils.*;
import java.util.HashSet;

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
    
}
