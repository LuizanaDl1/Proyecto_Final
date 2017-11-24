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
public class User {
    
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
             
    public User(String username, String password){
        this.username = username;
        this.password = password;
        nombre = "Erick ";
        apellidos = "Campos";
    }    

    
    
    public String getUsername(){
        return username;
        }
    public void setUsername(String username){
        this.username = username;
        }
        public String getPassword(){
        return password;
        }
    public void setPassword(String password){
        this.password = password;
        }
    
    public String getName(){
        return nombre;
            
    } 
     public String getLastName(){
        return nombre;   
    }
     
    public String getFullName(){
        return nombre + apellidos;   
    } 
     
    } 
            
    
    
    
    

