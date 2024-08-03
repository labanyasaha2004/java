package com.mycompany.javaproject;

public class parameterPassing {
    static int x = 99;
    static int y = 66;

    public static void swap() {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap();
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
