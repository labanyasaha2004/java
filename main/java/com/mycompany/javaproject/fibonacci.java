package com.mycompany.javaproject;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = i.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count <=n)
        {
            int temp=b;
            b += a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
