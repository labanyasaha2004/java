package com.mycompany.javaproject;
import java.util.Scanner;
public class labprog12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            int number = s.nextInt();
            
            if (number > 0)
            {
                positiveCount++;
            } else if (number < 0)
            {
                negativeCount++;
            }
            else
            {
                zeroCount++;
            }
        }
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);

    }


    
}
