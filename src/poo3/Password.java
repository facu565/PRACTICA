/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

/**
 *
 * @author facu
 */
public class Password {
    private int longitud;
    private String password;
    
    public int getlongitud(){
        return longitud;
        
    }
    public String getpassword(){
        return password;
        
    }
    public void setlongitud(int longi){
        longitud = longi;
    }
    public void setpassword(String passw){
        password= passw;
    }
    public String esFuerte(){
        int longi = password.length();
        if(longi > 8){
            return ("es buena");
        }
        else{
            return ("Es corta");
        }
        
    }
    public String generarPass(){
        for (int i = 8; i > longitud; i--){
            password += Long.toString(Math.round(Math.random()* password.length()));
        }
        return password;
        
    }
    @Override
    public String toString(){
        return password;
    }

}