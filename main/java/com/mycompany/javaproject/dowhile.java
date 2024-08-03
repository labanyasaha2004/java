package com.mycompany.javaproject;
import java.util.Scanner;

public class dowhile

{
    public  static  void  main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Enter a number between 1 and 10: ");
             n = s.nextInt();
        }
        while(n<1 || n>10);
        System.out.println(n + " is between 1 and 10: ");

    }
}

