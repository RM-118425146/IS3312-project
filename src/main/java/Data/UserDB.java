/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Business.UserDAO;
import Model.User;


public class UserDB {
    
    /** This will take a username and select from user table
     * This will return three possible statuses, login correct, 
     * unknown user or password incorrect
     * @param inUser 
     */
    public User loginUser(String email, String passWord){
        
        UserDAO userDAO = new UserDAO();
        User user = userDAO.getUserByEmail(email);
        if (user.getPassword().equals(passWord)){
            return user;
        }
        else return null;
    }
    
}
