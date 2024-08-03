package com.mycompany.javaproject;
import java.util.Scanner;
public class luckynumber
{
    public static  void main(String[] args)
    {
        System.out.print("Enter the four digit number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(!(n>999 && n<10000))
        {
            System.out.println("The number is invalid");
        }
        else
        {
            int dig4=(n%10);
            int dig3=(n/10)%10;
            int dig2=(n/100)%10;
            int dig1=(n%1000)%10;
            if(dig4 + dig3 == dig2 + dig1)
            {
                System.out.println("Lucky Number");
            }
            else
            {
                System.out.println("Not Lucky Number");
            }
        }
    }
}
