package RandomTransfer;

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
        String menu = "Menu: \n 1.Random Registration \n 2.List of all players  \n 3.Show Team Stats \n 4.Play Match \n 5.Tournament \n 6.Exit";
        System.out.println(menu);
        int option = 0;

        TransferMarket tm = new TransferMarket();

        while (option != 6) {

            try {
                System.out.println("Please choose an option between 1-6...");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        tm.RandomRegistration();
                        System.out.println("=====\n" + menu);
                        break;
                    case 2:
                        System.out.println("Showing all players, please wait...");
                        tm.ShowAllPlayers();
                        System.out.println("=====\n" + menu);
                        break;
                    case 3:
                        System.out.println("Team Stats...");
                        tm.ShowTeamStats();
                        break;
                    case 4:
                        System.out.println("Match starting...");
                        tm.PlayMatch();
                        break;
                    case 5:
                        System.out.println("Tournament starting...");
                        tm.Tournament();
                        break;
                    case 6:
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
