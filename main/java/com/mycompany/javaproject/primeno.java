package com.mycompany.javaproject;

import java.util.Scanner;

public class primeno
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int sum = 1;
        boolean isPrime = true;
        for (int i =2; i <= (n/2) ; i++)
        {
            if( n%i == 0)
            {
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime ? "primeno" : "notprime");


    }
}
