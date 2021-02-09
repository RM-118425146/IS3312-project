/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Business.ProductDAO;
import java.util.ArrayList;
import Model.Product;
import java.sql.SQLException;

/**
 *
 * @author be_me
 */
public class ProductService {
    
    public ArrayList<Product> getHomePageProducts(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getTopProducts(12);
        
    }
    
    public Product getProduct(String productCode) throws SQLException {
        ProductDAO productDAO = new ProductDAO();
        Product product = productDAO.getProductCode(productCode);
        return product;
    }

    public ArrayList<Product> getAllProducts() {
        ProductDAO pDao = new ProductDAO();
        ArrayList<Product> productList = pDao.getTopProducts(9);
        return productList;
    }

    public void insertProduct(Product nProduct) {
        ProductDAO pDao = new ProductDAO();
        pDao.insertProduct(nProduct);
    }

    public void updateProduct(Product nProduct) {
        ProductDAO pDao = new ProductDAO();
        pDao.updateProduct(nProduct);

    }

    public void deleteProduct(String productCode) {
        ProductDAO pDao = new ProductDAO();
        pDao.deleteProduct(productCode);

    }
        
    
}
