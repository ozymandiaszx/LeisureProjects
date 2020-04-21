/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author DOLPHIN-PC
 */
public class Node {

    double val;
    Node next;

    public Node(double v, Node n) {
        val = v;
        next = n;
    }
}
