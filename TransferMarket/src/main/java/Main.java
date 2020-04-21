
import java.util.Scanner;

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
        String menu = "Menu: \n 1.Register Player \n 2.Transfer Player \n 3.Loan Player \n 4.Retire Player \n 5.List of all players \n 6.Random Registration \n 7.Exit";
        System.out.println(menu);
        int option = 0;

        TransferMarket tm = new TransferMarket();

        while (option != 7) {

            try {
                System.out.println("Please choose an option between 1-7 ; maximum 100 transfers per day");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        tm.RegisterPlayer();
                        System.out.println("=====\n" + menu);

//                } else if (option == 2) {
//                    tm.TransferPlayer();
//                    System.out.println("=====\n" + menu);
//                } else if (option == 3) {
//                    tm.CancelAll();
//                    System.out.println("=====\n" + menu);
//
//                } else if (option == 4) {
//                    tm.CanDoctorGoHome();
//                    System.out.println("=====\n" + menu);
//
                        break;
                    case 5:
                        System.out.println("Showing all players, please wait...");
                        tm.ShowAllPlayers();
                        System.out.println("=====\n" + menu);
                        break;
                    case 6:
                        tm.RandomRegistration();
                        System.out.println("=====\n" + menu);
                        break;
                    case 7:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println(menu);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between 1-6.\n" + menu);
                sc.next();
            }

        }
    }
}
