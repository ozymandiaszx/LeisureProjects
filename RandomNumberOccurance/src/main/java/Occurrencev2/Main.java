package Occurrencev2;

/**
 *
 * @author DOLPHIN-PC
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> om = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a number : ");
            int t = sc.nextInt();
            if (t == -1) {
                break;
            }
            if (om.containsKey(t)) {
                int a = om.get(t);
                om.put(t, ++a);
            } else {
                om.put(t, 1);
            }
        }
        System.out.println(om);
    }
}
