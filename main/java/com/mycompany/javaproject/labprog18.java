package com.mycompany.javaproject;
import java.util.Scanner;
public class labprog18
{
    public  void finalize()
    {
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args)
    {
        labprog18 s1=new labprog18();
        s1=null;
        System.gc();
    }
}
