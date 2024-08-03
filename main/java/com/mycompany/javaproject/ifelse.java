package com.mycompany.javaproject;
import java.util.*;
public class ifelse
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num>10)
        {
            System.out.println("The number is greater than 10");
        }
        else if (num<10)
        {
            System.out.println("The number is less than 10");
        }
        else
        {
            System.out.println("The number is equal to 10");
        }
    }
}
