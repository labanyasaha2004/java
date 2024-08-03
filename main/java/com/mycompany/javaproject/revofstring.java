package com.mycompany.javaproject;

import java.util.Scanner;

public class revofstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = input.nextLine();
        String rev = "";
        for (int i = s.length()-1; i >=0  ; i--) {
            rev += s.charAt(i);
        }
        System.out.println(rev);


    }
}
