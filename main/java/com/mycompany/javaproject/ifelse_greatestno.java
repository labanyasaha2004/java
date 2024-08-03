package com.mycompany.javaproject;

import java.util.Scanner;

public class ifelse_greatestno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = input.nextInt();
        int max = num1 ;
        if(num2 > max)
        {
            max = num2;
        }
        if( num3 > max)
        {
            max = num3;
        }
        System.out.println("The greatest number is:  "+ max);
    }
}
