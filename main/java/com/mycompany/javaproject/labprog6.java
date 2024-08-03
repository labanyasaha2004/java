
package com.mycompany.javaproject;
import java.util.Scanner;
public class labprog6 {
    

     public static void main(String[] args)
     {
        Scanner input= new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1=input.nextInt();
        System.out.println("Input the second number:");
        int num2=input.nextInt();
                if(num1>num2)
                {
                       System.out.println("The first number is larger:");
                }
                else if(num2>num1)
                {
                    System.out.println("The second number is larger:");
                }
                else
                {
                    System.out.println("Both numbers are equal");
                }
     }
}


