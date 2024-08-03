package com.mycompany.javaproject;

public class staticgenericmethod {
    public static void main(String[] args) {
        genericPrint("Hello");
        genericPrint(123);
        genericPrint(12.0);
    }
    static <T>  void genericPrint(T t) {
        System.out.println(t);
    }
}
