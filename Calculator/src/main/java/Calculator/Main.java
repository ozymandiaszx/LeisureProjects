/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

//import java.util.*;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author DOLPHIN-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws Calculator.StackOverflowException
     */
    public static void main(String[] args) throws StackOverflowException {
        Scanner sc = new Scanner(System.in);
        String menu = "Welcome to the noob calculator, a leisure project by Raad\nCurrently it can do the basic things like Add, Subtract, Multiply, Divide, Mod, Power, Root etc.";
//        JOptionPane.showMessageDialog(null, "Welcome to the noob calculator, a leisure project by Raad\nCurrently it can do the basic things like Add, Subtract, Multiply, Divide, Mod, Power, Root etc.");
        Methods methods = new Methods();
        System.out.print(menu);
        int choice = 0;
        while (choice != 3) {
            try {
                System.out.println("\nPress 1 to use calculator\nPress 2 to see all answers\nPress 3 to exit.");
//                JOptionPane.showMessageDialog(null,"Press 1 to use calculator\nPress 2 to see all answers\nPress 3 to exit."); 
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Please enter a number");
                        double firstNum = sc.nextDouble();
//                         String n1 = JOptionPane.showInputDialog("Please enter a number");
//                         int firstNum = Integer.parseInt(n1);
                        System.out.println("Please enter an operator\nChoose between [ | + | - | x | / | ^ | % | ? | ]");
//                         String operator = JOptionPane.showInputDialog("Please enter an operator\\nChoose between [ | + | - | x | / | ^ | % | ? | ]");
                        String operator = sc.next();
                        System.out.println("Please enter second number");
//                         String n2 = JOptionPane.showInputDialog("Please enter second number");
                        double secondNum = sc.nextDouble();
//                         int secondNum = Integer.parseInt(n2);
                        methods.calculate(firstNum, secondNum, operator);
                        break;
                    case 2:
                        methods.MemoryOutput();
                        break;
                    case 3:
                        System.out.println("Thank you for using the calculator!");
//                        JOptionPane.showMessageDialog(null, "Thank you for using the calculator");
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Please enter between 1-3.\n" + menu);
//                JOptionPane.showMessageDialog(null, "Please enter between 1-3.\\n\" + menu");
                sc.next();
            }
        }
    }
}
