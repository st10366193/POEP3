/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.p2;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author katlego
 */
class Register {
    public void registerUser() {
        String firstName = JOptionPane.showInputDialog(null, "Enter Firstname");
        String lastName = JOptionPane.showInputDialog(null, "Enter Lastname");
        String username = JOptionPane.showInputDialog(null, "Enter Username");
       String password = getPasswordFromUser();

        if (isValidUsername(username)) {
            JOptionPane.showMessageDialog(null, "Username captured successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted. Ensure that username contains underscore and is more than 5 characters long");
        }

        if (isValidPassword(password)){
            JOptionPane.showMessageDialog(null, "Password is valid!");
        } else {
            JOptionPane.showMessageDialog(null, "Password is invalid!");
            
        }
    }

    public static String getPasswordFromUser() {
        return JOptionPane.showInputDialog("Enter your password:");
    }

    public static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() > 5;
    }

    public static boolean isValidPassword(String password) {
        String pattern = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern compiledPattern = Pattern.compile(pattern);
        return compiledPattern.matcher(password).matches();
    }
}
   
    

