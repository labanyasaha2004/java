package com.mycompany.javaproject;
import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
        System.out.println("Enter the first number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Enter the operator");
        char op = s.next().charAt(0);
        System.out.println("Enter the second number");
        int b = s.nextInt();
        System.out.println("Expression: "+ a + op + b);
        if(op == '+')
        {
            System.out.println(a+b);
        }
        else if (op == '-')
        {
            System.out.println(a-b);
        }
        else if(op == '*')
        {
            System.out.println(a*b);
        }
        else if(op == '/')
        {
            System.out.println(a/b);
        }


    }
}
