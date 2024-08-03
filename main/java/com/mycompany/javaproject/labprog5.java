package com.mycompany.javaproject;
import java.util.*;
public class labprog5 {
     public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1=input.nextInt();
        System.out.println("Input the second number:");
        int num2=input.nextInt()       ;
        System.out.println("The sum is :" +  (num1 + num2));  
        System.out.println("The product is :" + (num1*num2));
        System.out.println("The difference is :" + (num1-num2));
        System.out.println("The quotient is :" + num1/num2);
        
    }
    
}
