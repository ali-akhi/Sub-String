/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;

import java.util.Scanner;

/**
 *
 * @author ali
 */
public class SubString {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first String: ");
        String X = scan.nextLine();
        System.out.print("Enter second String: ");
        String Y = scan.nextLine();
        SubStr MySubStr = new SubStr();
        int first = X.length();
        int second = Y.length();
        MySubStr.print_Common_SubStr(X, Y, first, second);
        System.out.println(MySubStr.length_SubStr(X.toCharArray(), Y.toCharArray(), first, first));
    }

}
