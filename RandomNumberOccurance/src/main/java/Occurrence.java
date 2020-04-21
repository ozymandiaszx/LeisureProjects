
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
public class Occurrence {

    Scanner sc = new Scanner(System.in);

    Stack num;
    int size;
    Node top;

    public Occurrence() {
        num = new ListStack();
    }

    public void TakeInput() throws StackOverflowException {
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        num.push(number);
    }

    public void Randomoccurrence() {
        num.RandomOccurrence();
    }

}
