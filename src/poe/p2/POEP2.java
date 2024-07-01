/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.p2;
 
import javax.swing.JOptionPane;
/**
 *
 * @author katlego
 */
public class POEP2 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
          do{
         displayOptions();
            choice = Integer.parseInt(JOptionPane.showInputDialog("Enter Choice:"));

            switch (choice) {
                case 1:
                    Register reg = new Register();
                    reg.registerUser();
                    break;
                case 2:
                    Login log = new Login();
                    log.loginUser();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Exiting...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Choice! Please try again.");
                
        }
        Register my = new Register();
        my.registerUser();
        
        Login your = new Login();
        your.loginUser();
        
        Task our =new Task();
        our.AddTasks();
        
       
                
    }
        while(choice!=3);
                
    
}
     private static void displayOptions() {
         JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
        JOptionPane.showInputDialog(null,
                "Menu:\n1. Register\n2. Login\n3. Exit");
}
}
      
       
    
    

