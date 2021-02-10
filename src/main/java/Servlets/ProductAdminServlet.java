/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Service.*;
import Model.*;

/**
 *
 * @author Rory
 */
public class ProductAdminServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        ProductService pSer = new ProductService();

        String url = null;

        if (action == null) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        if (action.equals("listProducts")) {
            ArrayList<Product> Products = pSer.getAllProducts();
            request.setAttribute("Products", Products);
            request.getRequestDispatcher("/ProductAdmin.jsp").forward(request, response);
        }
        if (action.equals("add")) {
            request.getRequestDispatcher("/AddProduct.jsp").forward(request, response);
        }
        if (action.equals("delete")) {
            deleteProduct(request, response);
            ArrayList<Product> Products = pSer.getAllProducts();
            request.setAttribute("Products", Products);
            request.getRequestDispatcher("/ProductAdmin.jsp").forward(request, response);
        }
        if (action.equals("insertProduct")) {
            insertProduct(request, response);
            ArrayList<Product> Products = pSer.getAllProducts();
            request.setAttribute("Products", Products);
            request.getRequestDispatcher("/ProductAdmin.jsp").forward(request, response);
        }
        if (action.equals("updateProduct")) {
            updateProduct(request, response);
            ArrayList<Product> Products = pSer.getAllProducts();
            request.setAttribute("Products", Products);
            request.getRequestDispatcher("/ProductAdmin.jsp").forward(request, response);
        }
        if (action.equals("edit")) {
            String productCode = request.getParameter("itemCode");
            if (productCode == null) {
                request.getRequestDispatcher("/ProductAdmin.jsp").forward(request, response);
            } else {
                pSer = new ProductService();
                Product oldProduct = pSer.getProduct(productCode);
                request.setAttribute("oldProduct", oldProduct);
                request.getRequestDispatcher("/EditProduct.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("/ProductAdmin.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void insertProduct(HttpServletRequest request, HttpServletResponse response) {

        String Name = request.getParameter("name");
        String Description = request.getParameter("description");
        String ItemCode = request.getParameter("itemCode");
        String Category = request.getParameter("category");
        String price = request.getParameter("price");
        Float Price = Float.parseFloat(price);
        String ImageLocation = request.getParameter("imageLocation");

        Product newProduct = new Product();
        newProduct.setName(Name);
        newProduct.setitemCode(ItemCode);
        newProduct.setDescription(Description);
        newProduct.setCategory(Category);
        newProduct.setPrice(Price);
        newProduct.setImageLocation(ImageLocation);

        ProductService pSer = new ProductService();
        pSer.insertProduct(newProduct);
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {

        String Name = request.getParameter("name");
        String Description = request.getParameter("description");
        String ItemCode = request.getParameter("itemCode");
        String Category = request.getParameter("category");
        String price = request.getParameter("price");
        Float Price = Float.parseFloat(price);
        String ImageLocation = request.getParameter("imageLocation");

        Product newProduct = new Product();
        newProduct.setName(Name);
        newProduct.setitemCode(ItemCode);
        newProduct.setDescription(Description);
        newProduct.setCategory(Category);
        newProduct.setPrice(Price);
        newProduct.setImageLocation(ImageLocation);

        ProductService pSer = new ProductService();
        pSer.updateProduct(newProduct);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {

        String productCode = request.getParameter("productCode");
        ProductService pSer = new ProductService();
        pSer.deleteProduct(Integer.getInteger(productCode));
        return;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
