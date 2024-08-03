
package com.mycompany.javaproject;
import java.util.*;

public class labprog9 
{
     public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the radius of the circle:");
        double rad=input.nextDouble();
        double pi=3.14159;
        double di= 2*rad;
        double circ=2*pi*rad;
        double area=pi*rad*rad;
        System.out.println("Diameter of the circle is:" + di);
        System.out.println("Circumference of the circle is:" + circ);
        System.out.println("Area of the circle is:" + area);
    }    
}

