/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.p2;

import javax.swing.JOptionPane;

/**
 * 
 * @author katlego
 */
public class Login {
 
        String Firstname, Lastname,username,Password,registerMessage,loginMessage;
        boolean registered,loginValid;
        
        public boolean checkUserName(String username){
            return username.contains(" ") && username.length()<=5;
        }
    public boolean checkPasswordComplexity(String Password){
        boolean hasNumber,hasCapital,hasSpecial,isValid;
        hasNumber = false;
        hasCapital =false;
        hasSpecial = false;
        isValid =false;
        
        if (Password.length()>8){
            for (int s =0;s<Password.length();s++){
                char car = Password.charAt(s);
                if (Character.isDigit(car)){
                    hasNumber = true;
                }
                if (Character.isUpperCase(car)){
                    hasCapital = true;
                }
                if (Password.contains(" ! ")|| Password.contains("@")||Password.contains(" #")||Password.contains(" $")||Password.contains(" %")||Password.contains(" ^")||Password.contains(" &")||Password.contains(" *")||Password.contains(" ()")){
                hasSpecial=true;
            }
                if (hasNumber && hasSpecial && hasCapital){
                    isValid = true;
                    break;
                }
            }
        }
        return isValid;
    }
    public String RegisterUser(){ 
        Firstname = JOptionPane.showInputDialog("Enter Firstname");
        Lastname = JOptionPane.showInputDialog("Enter Lastname");
        
        boolean userNameValid=false;
        
        while(!userNameValid){
            username = JOptionPane.showInputDialog("Enter Username");
            if (null == username){
                userNameValid = true;
            }else{
               JOptionPane.showMessageDialog(null,"Wrong Username : please check if you have correct details");
            }
        }
            
            boolean passwordValid=false;
            while(Password == null){
                Password = JOptionPane.showInputDialog("Enter Password");
                if (checkPasswordComplexity(Password)){
                    passwordValid = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Please ensure your password is at least 8 characters long and includes at least one digit, one uppercase letter, and one special character.");
                }
      
            }
            registerMessage = "registration succesful";
            return registerMessage;
    }
    public boolean loginUser(){
        loginValid=false;
        registered = false;
        
        if (username != null){
            registered = true;  
        }else{
            JOptionPane.showMessageDialog(null, "Register");
        }
        if (!loginValid && registered){
            String newusername =JOptionPane.showInputDialog("Enter Username");
             String newPassword =JOptionPane.showInputDialog("Enter Password");
             
             if (username.equals(newusername) && Password.equals(newPassword)){
                 loginValid = true;
             }
        }
        return loginValid;
    }
    public String returnLoginStatus(){
        if (loginUser()){
            loginMessage = "Login Succesfull";
            
        }else{
            loginMessage = "Login Failed ";
        }
        return loginMessage;
    }
}
