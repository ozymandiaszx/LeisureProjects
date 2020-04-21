
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DOLPHIN-PC
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sw = 0;

        Occurrence oc = new Occurrence();

        while (sw != 3) {

            try {

                System.out.println("Press 1 to enter number\nPress 2 to check occurrence\nPress 3 to exit entry");
                sw = sc.nextInt();
                switch (sw) {
                    case 1:
                        oc.TakeInput();
                        break;
                    case 2:
                        oc.Randomoccurrence();
                        break;
                    case 3:
                        System.out.println("Exit input");
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between 1 - 3");
                sc.next();
            }
        }

    }
}
