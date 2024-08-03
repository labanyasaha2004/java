package com.mycompany.javaproject;
import java.util.Scanner;
public class reverseofnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        int ans=0;
        while(n>0)
        {
            int rem = n%10;
            n=n / 10;
            ans= ans * 10 +rem;
        }
        System.out.println("Reverse is : " + ans);

    }
}
