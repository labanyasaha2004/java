package com.mycompany.javaproject;
import java.util.Scanner;
public class strictdivisor
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        int sum = 0;
        for (int i =1; i <= (n/2) ; i++)
        {
            if( n%i == 0)
            {
                System.out.println(i + " is a strict divisor of " + n);

            }
            sum=sum+i;
        }

        System.out.println("Sum is  " +  sum );


    }
}
