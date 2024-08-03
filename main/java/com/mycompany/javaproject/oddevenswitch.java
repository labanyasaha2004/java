package com.mycompany.javaproject;

import java.util.*;

public class oddevenswitch
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        switch (num%2)
        {
            case 0:
                System.out.println("The number is even");
                break;
            default:
                System.out.println("The number is odd");
        }
    }
}
