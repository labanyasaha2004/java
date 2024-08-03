package com.mycompany.javaproject;

public class varargsellipsis {
    static void method(int ...v)
    {
        System.out.println("No of args : " + v.length);
        for(int i:v)
            System.out.print(i);
        System.out.println();
    }
    public static void main(String[] args) {
        method(7);
        method(-1,39,-2);

    }
}
