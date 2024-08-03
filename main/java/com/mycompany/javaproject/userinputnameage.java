package com.mycompany.javaproject;

import java.util.Scanner;

public class userinputnameage {
            public static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter your name: ");
                String name = input.nextLine();
                System.out.println("Enter your age: ");
                int age = input.nextInt();
                System.out.println("Your name and age is : " + name + " " +age );
            }
}
