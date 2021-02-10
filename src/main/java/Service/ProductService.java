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
        return pDao.getTopProducts();
        
    }
    
    public Product getProduct(int productCode){
        ProductDAO productDAO = new ProductDAO();
        Product product = productDAO.getProductCode(productCode);
        return product;
    }
    
    public Product getProduct(String productCode){
        ProductDAO productDAO = new ProductDAO();
        Product product = productDAO.getProductCode(productCode);
        return product;
    }
    
    public ArrayList<Product> getAllProducts() {
        ProductDAO pDao = new ProductDAO();
        ArrayList<Product> productList = pDao.getTopProducts();
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
    
    public ArrayList<String> getCategories(){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getCategories();
        
    }
    
    public ArrayList<Product> getCategoryProducts(String category){
        
        ProductDAO pDao = new ProductDAO();
        return pDao.getCategoryProducts(category);
        
    }
        
    
}
