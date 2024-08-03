package com.mycompany.javaproject;

import java.util.Scanner;

public class count_occurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        System.out.println("Enter digit to be checked:");
        int d = in.nextInt();
        int count=0;
        while( n> 0 )
        {
            int rem=n%10;
            {
                if (rem==d)
                    count++;
            }
            n=n/10;
        }
        System.out.println("Number of occurences of the digit is :" + count);

    }
}
