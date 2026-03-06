/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickserveapp;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
        import order.Order;

        
public class QuickServeApp {
 
    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>();
            menu.put ("Burger", 45.00);
            menu.put ("Pizza", 35.00);
            menu.put ("Coffee", 15.00);
            
        
        ///User Inputs
       String customerName = JOptionPane.showInputDialog(null, "please enter your name");
       String studentId = JOptionPane.showInputDialog(null, "please enter your student ID");
       
       Object[] options = menu.keySet().toArray();
       String SelectedItem = (String) JOptionPane.showInputDialog(null, "select an item:", "menu", JOptionPane.PLAIN_MESSAGE, null, options,
       options[0]
       );
       
       int quantity = 0;
       double pricePerItem = 0.0;
       Boolean CorrentInput = false;
       
    }
    
}
