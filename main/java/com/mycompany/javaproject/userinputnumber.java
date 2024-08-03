package com.mycompany.javaproject;

import java.util.Scanner;

//take input of the user's favourite number
public class userinputnumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        System.out.println("My favourite integer is : " + input.nextInt());
    }
}
