package com.mycompany.javaproject;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.next();
        System.out.println("The string is :" + str);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
        System.out.println("The reverse string is :" + rev);
        if (str.contentEquals(rev)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}