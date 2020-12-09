/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.ProductDAO;
import java.util.ArrayList;
import Model.Product;

/**
 *
 * @author be_me
 */
public class ProductDB {
    
    public ArrayList<Product> getHomePageProducts(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getTopProducts(12);
        
    }
        
    
}

