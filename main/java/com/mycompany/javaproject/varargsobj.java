package com.mycompany.javaproject;

class varargsobj {
    public static void method(Object... obj) {
        for (Object o : obj) {
            System.out.print(" " + o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        method(1, 2, 4);
        method("Hello", false);
    }
}
