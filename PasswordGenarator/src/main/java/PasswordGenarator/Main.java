/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordGenarator;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author DOLPHIN-PC
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
    static HashMap<Integer, String> hash = new HashMap<>();
    static String password = "";
    static String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String chars = "?*/;:!@#$%&_-+`~";
    static int passwordCount = 0;
    static int numCount = 0;
    static int charCount = 0;
    static String name = "";
    static int length = 0;

    public static void main(String[] args) {

        System.out.println("Please enter your name:");
        name = sc.next();
        System.out.println("Welcome to password generator, " + name + "\n");
        String menu = "Press 1 to generate new password\nPress 2 to see all generated passwords\nPress 3 to exit program";
        while (true) {
            System.out.println(menu);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createPassword();
                    password = "";
                    break;
                case 2:
                    showAllPassword();
                    break;
                default:
                    break;
            }
            if (choice == 3) {
                System.out.println("Thank you for using the password generator, " + name + "!");
                break;
            }
        }
    }

    private static void createPassword() {
        System.out.println("Please enter length of password"); //length of desired password
        length = sc.nextInt();
//                    int lengthCount = 0;
        char c;
//                    String temp;
        for (int i = 0; i < length; ++i) {
            int randomselect = ran.nextInt(4);
            switch (randomselect) {
                case 0:
                    c = upperCaseChars.charAt(ran.nextInt(upperCaseChars.length())); //chooses a letter randomly
                    password = password.concat(String.valueOf(c)); //concats string
//                                lengthCount++;
                    break;
                case 1:
                    c = lowerCaseChars.charAt(ran.nextInt(lowerCaseChars.length()));
                    password = password.concat(String.valueOf(c));
//                                lengthCount++;
                    break;
                case 2:
                    if (password.length() == 0 || password.length() + 1 == length) {
                        i--; //deleting this run of loop
                    } else { //password cant start with numbers
                        c = numbers.charAt(ran.nextInt(numbers.length()));
                        password = password.concat(String.valueOf(c));
//                                    lengthCount++;
                        numCount++;
                    }
                    break;

                case 3:
                    if (password.length() == 0 || password.length() + 1 == length) {
                        i--;
                    } else {
//                                if (lengthCount != 0) { //password cant start with chars
                        c = chars.charAt(ran.nextInt(chars.length()));
                        password = password.concat(String.valueOf(c));
//                                    lengthCount++;
                        charCount++;
                    }
                    break;

                default:
                    break;

            }
        }
        showCreatedPassword();
        saveChoice();
    }

    private static void showAllPassword() {
        System.out.println("Passwords generated for " + name + " so far : " + passwordCount);
        System.out.println("\n====================================================");
        for (int i = 1; i <= passwordCount; ++i) {
            System.out.println("Password " + i + " = [ " + hash.get(i) + " ]");
        }
        System.out.println("====================================================");
    }
    
    private static void showCreatedPassword() {
        System.out.println("\n*********************************************************************************");
        System.out.println("PASSWORD for " + name + " is : [ " + password + " ]\n" + "Length = " + length);
        System.out.println("*********************************************************************************\n");
    }

    private static void saveChoice() {
        System.out.println("\nPress 1 to save password in memory\nPress 2 to discard\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                passwordCount++;
                hash.put(passwordCount, password); //puts password in hashmap
                System.out.println("Password saved in memory!\n");
                break;
            case 2:
                passwordCount++;
                hash.put(passwordCount, "Discarded"); //puts password in hashmap
                System.out.println("Password discarded, not saved\n");
                break;
            default:
                break;
        }
    }

}
