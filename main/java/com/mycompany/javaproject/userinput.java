/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println( input.nextInt());
        float f=  input.nextFloat();
        System.out.println( f + 10);
        String s= input.next();
        System.out.println(s);
        Boolean b = input.nextBoolean();
        System.out.println("The answer is :" + b);
        String s2= input.nextLine();
        System.out.println(s2);
                
    }
    
}
