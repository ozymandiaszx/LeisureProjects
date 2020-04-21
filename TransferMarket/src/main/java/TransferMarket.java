
/**
 *
 * @author DOLPHIN-PC
 */
import java.util.Scanner;
import java.util.Random;

public class TransferMarket {

    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    Queue RealMadrid;
    Queue Barcelona;
    Queue ManchesterUnited;
    Queue ManchesterCity;
    Queue Juventus;
    Queue PSG;
    Queue BayernMunich;
    public static int id = 0;

    public TransferMarket() {

        RealMadrid = new ArrayQueue();
        Barcelona = new ArrayQueue();
        ManchesterUnited = new ArrayQueue();
        ManchesterCity = new ArrayQueue();
        Juventus = new ArrayQueue();
        PSG = new ArrayQueue();
        BayernMunich = new ArrayQueue();

    }

    public void RegisterPlayer() {

        System.out.println("Please enter your Name");
        String nm = sc.next();
        System.out.println("Please enter your Age(Must be numbers)");
        int a = sc.nextInt();
        System.out.println("Please enter your Position");
        String pos = sc.next();
        System.out.println("Please enter desired team\nPress 1 for RealMadrid\nPress 2 for Barcelona\nPress 3 for ManchesterUnited\nPress 4 for ManchesterCity\nPress 5 for Juventus\nPress 6 for PSG\nPress 7 for BayernMunich");
        int team = sc.nextInt();
        id++;

        Player p = new Player(nm, a, pos, id);
        try {
            switch (team) {
                case 1:
                    RealMadrid.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 2:
                    Barcelona.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 3:
                    ManchesterUnited.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 4:
                    ManchesterCity.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 5:
                    Juventus.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 6:
                    PSG.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 7:
                    BayernMunich.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration is confirmed! Your id is [ " + id + " ] ");
                    break;
                default:
                    break;
            }
        } catch (QueueOverflowException e) {
            System.out.println("Registration full for today, try tomorrow\n" + e);
        }
    }

//    public void TransferPlayer() {
//        System.out.println("Choose team to transfer to :");
//        Object to = sc.next();
//        System.out.println("Enter team to transfer from :");
//        Object from = sc.next();
//        try {
//            Player x = (Player) from.dequeue();
//            to.enqueue(x) ;
//            System.out.println(x.name + " transfered to " + to + " from " + from );
//        } catch (QueueUnderflowException e) {
//            System.out.println("No remaining patients");
//        }
//    }
//
//    public void LoanPlayer() {
//        if (q.size() > 0) {
//            System.out.println("All Appointments canceled");
//        }
//        for (int i = 0; i <= q.size(); i++) {
//            try {
//                q.dequeue();
//            } catch (QueueUnderflowException e) {
//                System.out.println("No Appointment left to cancel");
//            }
//
//        }
//    }
//
//    public void RetirePlayer() {
//        if (q.isEmpty()) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//
    public void ShowAllPlayers() {
        System.out.println("Enter Team\nPress 1 for RealMadrid\nPress 2 for Barcelona\nPress 3 for ManchesterUnited\nPress 4 for ManchesterCity\nPress 5 for Juventus\nPress 6 for PSG\nPress 7 for BayernMunich");
        int team = sc.nextInt();
        switch (team) {
            case 1:
                if (RealMadrid.size() == 0) {
                    System.out.println("No Players left");
                } else {
                    RealMadrid.linearView();
                }
                break;
            case 2:
                if (Barcelona.size() == 0) {
                    System.out.println("No Players left");
                } else {
                    Barcelona.linearView();
                }
                break;
            case 3:
                if (ManchesterUnited.size() == 0) {
                    System.out.println("No Players left");
                } else {
                    ManchesterUnited.linearView();
                }
                break;
            case 4:
                if (ManchesterCity.size() == 0) {
                    System.out.println("No Players left");
                } else {
                    ManchesterCity.linearView();
                }
                break;
            case 5:
                if (Juventus.size() == 0) {
                    System.out.println("No Players left");
                } else {
                    Juventus.linearView();
                }
                break;
            case 6:
                if (PSG.size() == 0) {
                    System.out.println("No Players left");
                } else {
                    PSG.linearView();
                }
                break;
            case 7:
                if (BayernMunich.size() == 0) {
                    System.out.println("No Players left");
                } else {
                    BayernMunich.linearView();
                }
                break;
            default:
                System.out.println("Please enter between 1 - 7");
                break;
        }
    }

    public void RandomRegistration() {
        System.out.println("Please enter your Name");
        String nm = sc.next();
        System.out.println("Please enter your Age(Must be numbers)");
        int a = sc.nextInt();
        System.out.println("Please enter your Position");
        String pos = sc.next();
        int ran1 = ran.nextInt(6);
        id++;

        Player p = new Player(nm, a, pos, id);
        try {
            switch (ran1) {
                case 0:
                    RealMadrid.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration to Real Madrid is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 1:
                    Barcelona.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration to Barcelona is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 2:
                    ManchesterUnited.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration to ManchesterUnited is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 3:
                    ManchesterCity.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration to ManchesterCity is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 4:
                    Juventus.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration to Juventus is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 5:
                    PSG.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration to PSG is confirmed! Your id is [ " + id + " ] ");
                    break;
                case 6:
                    BayernMunich.enqueue(p);
                    System.out.println("Congratulations! " + p.name + " , your registration to BayernMunich is confirmed! Your id is [ " + id + " ] ");
                    break;
                default:
                    break;
            }
        } catch (QueueOverflowException e) {
            System.out.println("Registration full for today, try tomorrow\n" + e);
        }
    }
}
