package com.mycompany.javaproject;

import java.lang.reflect.Type;

public class genericmethod
{
    <T> void genericPrint(T t)
    {
        System.out.println(t);
    }
    public static void main(String [] args)
    {
        genericmethod obj= new genericmethod();
        obj.genericPrint(11);
        obj.genericPrint("Java");
        obj.genericPrint(10.0);

    }
}
