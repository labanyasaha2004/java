package com.mycompany.javaproject;

import java.util.Scanner;

public class forloop1toN{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        for (int num = 1; num <=n ; num++) {
            System.out.println(num);

        }
    }
}
