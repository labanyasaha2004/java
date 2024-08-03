package com.mycompany.javaproject;

import java.util.Scanner;
public class method3 {
    public static String Name(){
        Scanner s = new Scanner(System.in);
        String a= s.nextLine();
        return a;
    }
    public static int Age(){
        Scanner s = new Scanner(System.in);
        int b= s.nextInt();
        return b;
    }
    public static void main(String[] args) {
        System.out.println("Enter name: ");
        System.out.println(Name() + " " + Age());
    }




}
