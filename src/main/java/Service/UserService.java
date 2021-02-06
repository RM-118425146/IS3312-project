/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Business.UserDAO;
import java.util.ArrayList;
import Model.User;
import Utils.IConstants;

/**
 *
 * @author be_me
 */
public class UserService {
    
    public User loginUser(String email, String password){
        
       UserDAO userDAO = new UserDAO();
        User user = userDAO.getUserByEmail(email);
        if (user.getPassword().equals(password)){
            return user;
        }
        else return null;
    }
    
    public ArrayList<User> getAllUsers(){
       
        UserDAO uDao = new UserDAO();
        ArrayList<User> userList = uDao.getAllUsers();
        return userList;
        
    }
    
    public void insertUser(User nUser){
        UserDAO uDao = new UserDAO();
        uDao.insertUser(nUser);
        return;
        
    }
    
}
