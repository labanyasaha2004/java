package com.mycompany.javaproject;

public class method4 {
    public static void main(String[] args) {
        printBetween(1, 50);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false; //
            }
        }
        return true;
    }

    public static void printBetween(int first, int last) {
        for (int i = first; i <= last; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}