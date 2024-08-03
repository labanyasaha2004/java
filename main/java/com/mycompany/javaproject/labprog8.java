/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;
import java.util.*;
public class labprog8 {
     public static void main(String[] args)
    {
         Scanner input=new Scanner(System.in);
     System.out.println("Input the number:");
        int num1=input.nextInt();
        System.out.println("Input the second number:");
        int num2=input.nextInt();
                if( num2 % num1==0 )
                {
                        System.out.println("The second is a multiple of the first");
                }
                else
                {
                        System.out.println("The second number is not a multiple of the first:");
                }
    
    }
}

    

