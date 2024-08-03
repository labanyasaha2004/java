package com.mycompany.javaproject;
import java.util.Scanner;

public class sum100 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while (sum<=100)
        {
            System.out.println("Enter a number:" );
            sum+=s.nextInt();

        }
        System.out.println(sum);
        System.out.println("Done");


        }


    }

