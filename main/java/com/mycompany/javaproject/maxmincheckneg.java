package com.mycompany.javaproject;
import java.util.Scanner;
public class maxmincheckneg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int n = s.nextInt();
        int max = n;
        int min = n;

        while (true) {
            n = s.nextInt();
            if (n < 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max = " + max + ", Min = " + min);
        s.close();
    }
}
