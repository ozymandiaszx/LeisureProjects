/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author DOLPHIN-PC
 */
public class find {

    static void findAbc(String input) {
        int index = input.indexOf("abc");
        while (true) {
            if (index == -1) {
                break;
            }
//            if(index >input.length() - 3){
//            break;
//            }
            String found = input.substring(index + 1, index + 4);
            System.out.println(found);
            index = input.indexOf("abc", index + 4);
        }
    }

    public static void main(String[] args) {
        //no code yet
//        findAbc("abcd");
        findAbc("abcdabc");
    }
}
