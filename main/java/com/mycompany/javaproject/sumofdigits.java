package com.mycompany.javaproject;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digits: "); //ABC
        int n= input.nextInt();
        int sum = 0;
        while(n>0){
            sum+=n%10; // add C to sum
            n/=10;   // remove c from AB
        }
        System.out.println("The sum is: "+sum);

    }
}
