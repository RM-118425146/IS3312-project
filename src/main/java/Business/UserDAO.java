/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Model.User;
import Utils.IConstants;


public class UserDAO {

    public User getUserByEmail(String email) {

        //Username for Admin is: admin@admin.com | Password is: Admin
        User Admin = new User(1,"admin@admin.com","Admin","Admin","Admin", IConstants.USER_TYPE_ADMIN);
        //Normal users can have any email that isn't the same as admin
        //The password for user must be User
        User other = new User(2,email,"User","User","User", IConstants.USER_TYPE_GENERAL_USER);
        
        if(email.equals("admin@admin.com")){
            return Admin;
        } else{
            return other;
        }
            
        
    }
 
    public void insertUser(User newUser){
           
    }

}
