/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

//import static Calculator.Main.calculate;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author DOLPHIN-PC
 */
public class Methods {

    Stack s;
    int calculateCount = 0;

    public Methods() {

        s = new ListStack();

    }

    public void calculate(double x, double y, String operator) throws StackOverflowException {
        calculateCount++;
        Scanner sc = new Scanner(System.in);
        double result0 = 0.0;
        switch (operator) {
            case "+":
                double result1 = x + y;
                System.out.println("The addition of " + x + " and " + y + " is : " + result1);
//                JOptionPane.showMessageDialog(null, "The addition of " + x + " and " + y + " is : " + result1);
                result0 = result1;
                break;
            case "-":
                double result2 = x - y;
                System.out.println("The subtraction of " + y + " from " + x + " is : " + result2);
                result0 = result2;
                break;
            case "x":
            case "X":
            case "*":
                double result3 = x * y;
                System.out.println("The multiplication between " + x + " and " + y + " is : " + result3);
                result0 = result3;
                break;
            case "/":
                double result4 = x / y;
                System.out.println("The division of " + x + " by " + y + " is : " + result4);
                result0 = result4;
                break;
            case "^":
                double result5 = (Math.pow(x, y));
                System.out.println("The answer of power " + y + " on " + x + " is : " + result5);
                result0 = result5;
                break;
            case "%":
                double result6 = (x % y);
                System.out.println("The remainder of the division of " + x + " by " + y + " is : " + result6);
                result0 = result6;
                break;
            case "root":
                System.out.println("Enter 1 for root of x \n Enter 2 for root of y : ");
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        double result7 = (Math.sqrt(x));
                        System.out.println("The square root of " + x + " is : " + result7);
                        result0 = result7;
                        break;
                    case 2:
                        double result8 = Math.sqrt(y);
                        System.out.println("The square root of " + y + " is : " + result8);
                        result0 = result8;
                        break;
                }
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }
        MemoryInput(result0);
    }

    public void MemoryInput(double x) throws StackOverflowException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 to save outcome in memory");
        int input = sc.nextInt();
        if (input == 1) {
            s.push(x);
        }
    }

    public void MemoryOutput() throws StackUnderflowException {
        int cc = 0;
        System.out.println("The Answers are...");
        while (cc <= calculateCount) {
            System.out.println(s.pop());
            cc++ ;
        }
    }
}
