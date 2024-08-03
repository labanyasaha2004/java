package com.mycompany.javaproject;

import java.util.Scanner;

public class stringwithspace {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
