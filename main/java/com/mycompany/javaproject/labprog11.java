package com.mycompany.javaproject;

public class labprog11 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println(i + "\t" + square + "\t" + cube);
        }
    }
}
