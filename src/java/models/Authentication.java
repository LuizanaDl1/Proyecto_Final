/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Erick Alejandro
 */
public class Authentication {
     public static boolean authenticate(String username, String password) {

                
        String userDataBase = "3RICX";
        String passwordDataBase = "contra";
    

      
        if(username.equals(userDataBase) && password.equals(passwordDataBase)) {
            return true;
        }
        else {
            return false;
        }
    }
}

