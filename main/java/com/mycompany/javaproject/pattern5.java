package com.mycompany.javaproject;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
