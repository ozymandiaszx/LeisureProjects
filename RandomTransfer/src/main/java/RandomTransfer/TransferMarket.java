package RandomTransfer;

/**
 *
 * @author DOLPHIN-PC
 */
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

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
    Queue Liverpool;
    Queue Substitutes;
    Queue All;
    public int rmapow = 0;
    public int barpow = 0;
    public int mnupow = 0;
    public int mcipow = 0;
    public int juvpow = 0;
    public int psgpow = 0;
    public int bayernpow = 0;
    public int livpow = 300;
    public int rmapc = 0;
    public int barpc = 0;
    public int mnupc = 0;
    public int mcipc = 0;
    public int juvpc = 0;
    public int psgpc = 0;
    public int bayernpc = 0;
    public int livpc = 0;
    public int subpc = 0;
    public int allpc = 0;

    public TransferMarket() {

        All = new ArrayQueue();
        RealMadrid = new ArrayQueue();
        Barcelona = new ArrayQueue();
        ManchesterUnited = new ArrayQueue();
        ManchesterCity = new ArrayQueue();
        Juventus = new ArrayQueue();
        PSG = new ArrayQueue();
        BayernMunich = new ArrayQueue();
        Liverpool = new ArrayQueue();
        Substitutes = new ArrayQueue();

    }

    public void RandomRegistration() throws QueueOverflowException {
        System.out.println("Please enter your Name");
        String nm = sc.next();
//        System.out.println("Please enter your Age(Must be numbers)");
//        int a = sc.nextInt();
//        System.out.println("Please enter your Position");
//        String pos = sc.next();
//        int st = ran.nextInt(9);
        System.out.println("Please enter overall stat");
        int st = sc.nextInt();
        int ran1 = ran.nextInt(8);

//        Player p = new Player(nm, a, pos, id, st);
        Player p = new Player(nm, st);
        All.enqueue(p);
        allpc++;
        try {
            switch (ran1) {
                case 0:
                    if (rmapc < 5) {
                        RealMadrid.enqueue(p);
                        rmapc++;
                        rmapow += p.stat;
                        System.out.println(p.name + " transferred to Real Madrid ! [Team strength " + rmapow + " ] - [ Team player count " + rmapc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
                case 1:
                    if (barpc < 5) {
                        Barcelona.enqueue(p);
                        barpc++;
                        barpow += p.stat;
                        System.out.println(p.name + " transferred to Barcelona ! [Team strength " + barpow + " ] - [ Team player count " + barpc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
                case 2:
                    if (mnupc < 5) {
                        ManchesterUnited.enqueue(p);
                        mnupc++;
                        mnupow += p.stat;
                        System.out.println(p.name + " transferred to ManchesterUnited ! [Team strength " + mnupow + " ] - [ Team player count " + mnupc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
                case 3:
                    if (mcipc < 5) {
                        ManchesterCity.enqueue(p);
                        mcipc++;
                        mcipow += p.stat;
                        System.out.println(p.name + " transferred to Manchester City ! [Team strength " + mcipow + " ] - [ Team player count " + mcipc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
                case 4:
                    if (juvpc < 5) {
                        Juventus.enqueue(p);
                        juvpc++;
                        juvpow += p.stat;
                        System.out.println(p.name + " transferred to Juventus ! [Team strength " + juvpow + " ] - [ Team player count " + juvpc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
                case 5:
                    if (psgpc < 5) {
                        PSG.enqueue(p);
                        psgpc++;
                        psgpow += p.stat;
                        System.out.println(p.name + " transferred to PSG ! [Team strength " + psgpow + " ] - [ Team player count " + psgpc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
                case 6:
                    if (bayernpc < 5) {
                        BayernMunich.enqueue(p);
                        bayernpc++;
                        bayernpow += p.stat;
                        System.out.println(p.name + " transferred to Bayern Munich ! [Team strength " + bayernpow + " ] - [ Team player count " + bayernpc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
                case 7:
                    if (livpc < 5) {
                        Liverpool.enqueue(p);
                        livpc++;
                        livpow += p.stat;
                        System.out.println(p.name + " transferred to Liverpool ! [Team strength " + livpow + " ] - [ Team player count " + livpc + " ] - [ All player count " + allpc + " ] ");
                    } else {
                        System.out.println("Team Full");
                        Substitutes.enqueue(p);
                        subpc++;
                    }
                    break;
//                case 1:
//                    if (barpc < 5) {
//                        Barcelona.enqueue(p);
//                        barpc++;
//                        barpow += p.stat;
//                        System.out.println(p.name + " transferred to Barcelona ! [Team strength " + barpow + " ] - [ Team player count " + barpc + " ] - [ All player count " + allpc + " ] ");
//                    } else {
//                        System.out.println("Team Full");
//                        Substitutes.enqueue(p);
//                        subpc++;
//                    }
//                    break;
//                case 2:
//                    if (mnupc < 5) {
//                        ManchesterUnited.enqueue(p);
//                        mnupc++;
//                        mnupow += p.stat;
//                        System.out.println(p.name + " transferred to Manchester United ! [Team strength " + mnupow + " ] - [ Team player count " + mnupc + " ] - [ All player count " + allpc + " ] ");
//                    } else {
//                        System.out.println("Team Full");
//                        Substitutes.enqueue(p);
//                        subpc++;
//                    }
//                    break;
//                case 3:
//                    if (mcipc < 5) {
//                        ManchesterCity.enqueue(p);
//                        mcipc++;
//                        mcipow += p.stat;
//                        System.out.println(p.name + " transferred to Manchester City ! [Team strength " + mcipow + " ] - [ Team player count " + mcipc + " ] - [ All player count " + allpc + " ] ");
//                    } else {
//                        System.out.println("Team Full");
//                        Substitutes.enqueue(p);
//                        subpc++;
//                    }
//                    break;
//                case 4:
//                    if (juvpc < 5) {
//                        Juventus.enqueue(p);
//                        juvpc++;
//                        juvpow += p.stat;
//                        System.out.println(p.name + " transferred to Juventus ! [Team strength " + juvpow + " ] - [ Team player count " + juvpc + " ] - [ All player count " + allpc + " ] ");
//                    } else {
//                        System.out.println("Team Full");
//                        Substitutes.enqueue(p);
//                        subpc++;
//                    }
//                    break;
//                case 7:
//                    if (psgpc < 5) {
//                        PSG.enqueue(p);
//                        psgpc++;
//                        psgpow += p.stat;
//                        System.out.println(p.name + " transferred to PSG ! [Team strength " + psgpow + " ] - [ Team player count " + psgpc + " ] - All player count [ " + allpc + " ] ");
//                    } else {
//                        System.out.println("Team Full");
//                        Substitutes.enqueue(p);
//                        subpc++;
//                    }
//                    break;
//                case 5:
//                    if (bayernpc < 5) {
//                        BayernMunich.enqueue(p);
//                        bayernpc++;
//                        bayernpow += p.stat;
//                        System.out.println(p.name + " transferred to Bayern Munich ! [Team strength " + bayernpow + " ] - [ Team player count " + bayernpc + " ] - All player count [ " + allpc + " ] ");
//                    } else {
//                        System.out.println("Team Full");
//                        Substitutes.enqueue(p);
//                        subpc++;
//                    }
//                case 6:
//                    if (livpc < 5) {
//                        Liverpool.enqueue(p);
//                        livpc++;
//                        livpow += p.stat;
//                        System.out.println(p.name + " transferred to Liverpool ! [Team strength " + livpow + " ] - [ Team player count " + livpc + " ] - All player count [ " + allpc + " ] ");
//                    } else {
//                        System.out.println("Team Full");
//                        Substitutes.enqueue(p);
//                        subpc++;
//                    }
                default:
                    break;
            }
        } catch (QueueOverflowException e) {
            System.out.println("Registration full for today, try tomorrow\n" + e);
        }
    }

    public void ShowAllPlayers() {
        System.out.println("Enter Team\nPress 1 for Real Madrid\nPress 2 for Barcelona\nPress 3 for Manchester United\nPress 4 for Manchester City\nPress 5 for Juventus\nPress 6 for PSG\nPress 7 for Bayern Munich\nPress 8 for Liverpool\nPress 9 for Substitutes\nPress 10 for All players");
        int team = sc.nextInt();
        switch (team) {
            case 1:
                if (rmapc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for Real Madrid....");
                    RealMadrid.linearView();
                }
                break;
            case 2:
                if (barpc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for Barcelona....");
                    Barcelona.linearView();
                }
                break;
            case 3:
                if (mnupc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for Manchester United....");
                    ManchesterUnited.linearView();
                }
                break;
            case 4:
                if (mcipc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for Manchester City....");
                    ManchesterCity.linearView();
                }
                break;
            case 5:
                if (juvpc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for Juventus....");
                    Juventus.linearView();
                }
                break;
            case 6:
                if (psgpc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for PSG....");
                    PSG.linearView();
                }
                break;
            case 7:
                if (bayernpc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for Bayern Munich....");
                    BayernMunich.linearView();
                }
                break;
            case 8:
                if (livpc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players for Liverpool....");
                    Liverpool.linearView();
                }
                break;
            case 9:
                if (subpc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all substitute players....");
                    Substitutes.linearView();
                }
                break;
            case 10:
                if (allpc == 0) {
                    System.out.println("No Players left");
                } else {
                    System.out.println("Showing all players....");
                    All.linearView();
                }
                break;
            default:
//                System.out.println("Please enter between 1 - 7");
                break;
        }
    }

    public void ShowTeamStats() {
        System.out.println("Press 1 for All Team Stats\nPress 2 for specific team stats");
        int sw = sc.nextInt();
        switch (sw) {
            case 1:
                System.out.println("Real Madrid player count = " + rmapc);
                System.out.println("Real Madrid team stat = " + rmapow);
                System.out.println("Barcelona player count = " + barpc);
                System.out.println("Barcelona team stat = " + barpow);
                System.out.println("Manchester United player count = " + mnupc);
                System.out.println("Manchester United team stat = " + mnupow);
                System.out.println("Manchester City player count = " + mcipc);
                System.out.println("Manchester City team stat = " + mcipow);
                System.out.println("Juventus player count = " + juvpc);
                System.out.println("Juventus team stat = " + juvpow);
                System.out.println("PSG player count = " + psgpc);
                System.out.println("PSG team stat = " + psgpow);
                System.out.println("Bayern Munich player count = " + bayernpc);
                System.out.println("Bayern Munich team stat = " + bayernpow);
                System.out.println("Liverpool player count = " + livpc);
                System.out.println("Liverpool team stat = " + livpow);
                System.out.println("Substitute player count = " + subpc);
                System.out.println("All player count = " + allpc);
                break;
            case 2:
                System.out.println("Enter Team\nPress 1 for Real Madrid\nPress 2 for Barcelona\nPress 3 for Manchester United\nPress 4 for Manchester City\nPress 5 for Juventus\nPress 6 for PSG\nPress 7 for Bayern Munich\nPress 8 for Liverpool\nPress 9 for Substitutes\nPress 10 for All players");
//        System.out.println("Enter Team\nPress 1 for RealMadrid\nPress 2 for Barcelona\nPress 3 for ManchesterUnited\nPress 4 for ManchesterCity\nPress 5 for Juventus\nPress 6 for PSG\nPress 7 for BayernMunich\nPress 8 for Substitutes\nPress 9 for All players");
                int team = sc.nextInt();
                switch (team) {
                    case 1:
                        System.out.println("Real Madrid player count = " + rmapc);
                        System.out.println("Real Madrid team stat = " + rmapow);
                        break;
                    case 2:
                        System.out.println("Barcelona player count = " + barpc);
                        System.out.println("Barcelona team stat = " + barpow);
                        break;
                    case 3:
                        System.out.println("Manchester United player count = " + mnupc);
                        System.out.println("Manchester United team stat = " + mnupow);
                        break;
                    case 4:
                        System.out.println("Manchester City player count = " + mcipc);
                        System.out.println("Manchester City team stat = " + mcipow);
                        break;
                    case 5:
                        System.out.println("Juventus player count = " + juvpc);
                        System.out.println("Juventus team stat = " + juvpow);
                        break;
                    case 6:
                        System.out.println("PSG player count = " + psgpc);
                        System.out.println("PSG team stat = " + psgpow);
                        break;
                    case 7:
                        System.out.println("Bayern Munich player count = " + bayernpc);
                        System.out.println("Bayern Munich team stat = " + bayernpow);
                        break;
                    case 8:
                        System.out.println("Liverpool player count = " + livpc);
                        System.out.println("Liverpool team stat = " + livpow);
                        break;
                    case 9:
                        System.out.println("Substitute player count = " + subpc);
                        break;
                    case 10:
                        System.out.println("All player count = " + allpc);
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
    }

    public void PlayMatch() {
        String opponent1 = null;
        String opponent2 = null;
        int opponent1stat = 0;
        int opponent2stat = 0;
        System.out.println("Enter 1st team\nPress 1 for Real Madrid\nPress 2 for Barcelona\nPress 3 for Manchester United\nPress 4 for Manchester City\nPress 5 for Juventus\nPress 6 for PSG\nPress 7 for Bayern Munich\nPress 8 for Liverpool");
        int team1 = sc.nextInt();
        switch (team1) {
            case 1:
                opponent1stat = rmapow;
                opponent1 = "Real Madrid";
                System.out.println("First Contender is " + opponent1);
                break;
            case 2:
                opponent1stat = barpow;
                opponent1 = "Barcelona";
                System.out.println("First Contender is " + opponent1);
                break;
            case 3:
                opponent1stat = mnupow;
                opponent1 = "Manchester United";
                System.out.println("First Contender is " + opponent1);
                break;
            case 4:
                opponent1stat = mcipow;
                opponent1 = "Manchester City";
                System.out.println("First Contender is " + opponent1);
                break;
            case 5:
                opponent1stat = juvpow;
                opponent1 = "Juventus";
                System.out.println("First Contender is " + opponent1);
                break;
            case 6:
                opponent1stat = psgpow;
                opponent1 = "PSG";
                System.out.println("First Contender is " + opponent1);
                break;
            case 7:
                opponent1stat = bayernpow;
                opponent1 = "Bayern Munich";
                System.out.println("First Contender is " + opponent1);
                break;
            case 8:
                opponent1stat = livpow;
                opponent1 = "Liverpool";
                System.out.println("First Contender is " + opponent1);
                break;
            default:
                break;
        }
        System.out.println("Enter 2nd team\nPress 1 for Real Madrid\nPress 2 for Barcelona\nPress 3 for Manchester United\nPress 4 for Manchester City\nPress 5 for Juventus\nPress 6 for PSG\nPress 7 for Bayern Munich\nPress 8 for Liverpool");
        int team2 = sc.nextInt();
        switch (team2) {
            case 1:
                opponent2stat = rmapow;
                opponent2 = "Real Madrid";
                System.out.println("Second Contender is " + opponent2);
                break;
            case 2:
                opponent2stat = barpow;
                opponent2 = "Barcelona";
                System.out.println("Second Contender is " + opponent2);
                break;
            case 3:
                opponent2stat = mnupow;
                opponent2 = "Manchester United";
                System.out.println("Second Contender is " + opponent2);
                break;
            case 4:
                opponent2stat = mcipow;
                opponent2 = "Manchester City";
                System.out.println("Second Contender is " + opponent2);
                break;
            case 5:
                opponent2stat = juvpow;
                opponent2 = "Juventus";
                System.out.println("Second Contender is " + opponent2);
                break;
            case 6:
                opponent2stat = psgpow;
                opponent2 = "PSG";
                System.out.println("Second Contender is " + opponent2);
                break;
            case 7:
                opponent2stat = bayernpow;
                opponent2 = "Bayern Munich";
                System.out.println("Second Contender is " + opponent2);
                break;
            case 8:
                opponent2stat = livpow;
                opponent2 = "Liverpool";
                System.out.println("Second Contender is " + opponent2);
                break;
            default:
                break;
        }

        System.out.println("Match between " + opponent1 + " and " + opponent2 + " begins!");
        int diff = 0;
        if (opponent1stat > opponent2stat) {
            diff = opponent1stat - opponent2stat;
            System.out.println(opponent1 + " wins by " + diff + " points!");
        } else if (opponent2stat > opponent1stat) {
            diff = opponent2stat - opponent1stat;
            System.out.println(opponent2 + " wins by " + diff + " points!");
        } else {
            System.out.println("Match draw!");

        }
    }

    public void Tournament() {
//        System.out.println("Tournament starting...");
        int[] power;
        power = new int[8];
        power[0] = rmapow;
        power[1] = barpow;
        power[2] = mnupow;
        power[3] = mcipow;
        power[4] = juvpow;
        power[5] = psgpow;
        power[6] = bayernpow;
        power[7] = livpow;
        int[] sorted = bubbleSort(power);

        HashMap<Integer, String> team = new HashMap<>();
        team.put(rmapow, "Real Madrid");
        team.put(barpow, "Barcelona");
        team.put(mnupow, "Manchester United");
        team.put(mcipow, "Manchester City");
        team.put(juvpow, "Juventus");
        team.put(psgpow, "PSG");
        team.put(bayernpow, "Bayern Munich");
        team.put(livpow, "Liverpool");
        int position = 1;
        System.out.println("Position - Rank - Team - Points");
        for (int i = sorted.length - 1; i >= 0; i--) {
            System.out.println("Position - " + position + " - " + team.get(sorted[i]) + " - " + sorted[i] + " points");
            position++;
        }

    }

    public int[] bubbleSort(int[] src) {
        int[] sorted = copyArray(src);
        for (int i = 0; i < sorted.length; ++i) {
            for (int j = i + 1; j < src.length; ++j) {
                if (sorted[i] < sorted[j]) {
                } else {
                    int temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    public int[] copyArray(int[] src) {
        int[] copied = new int[src.length];
        for (int i = 0; i < src.length; ++i) {
            copied[i] = src[i];
        }
        return copied;
    }

    public static void printArray(int[] source) {
        for (int i = source.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(source[i] + "\n");
            } else {
                System.out.print(source[i] + ", ");
            }
        }
    }

}
