package com.mycompany.javaproject;
public class evennos1to100
{
    public static void main(String [] args)
    {
        System.out.println("Even nos between 1 to 100 are:");
        for(int i=1;i<=100;i++)
        {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
