package com.mycompany.javaproject;
import java.util.*;
public class switchbreak
{
    public static void main (String[] args)
    {
        System.out.println("Enter the number");
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        switch(n)
        {
            case 10:
                System.out.println("The number is 10");
            case 5:
                System.out.println("The number is 5");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            default:
                System.out.println("None of the above");


        }

    }
}

