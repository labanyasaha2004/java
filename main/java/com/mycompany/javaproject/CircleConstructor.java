package com.mycompany.javaproject;
import java.awt.*;

public class CircleConstructor { 
    Point center;   //global variable//
    double radius;  //global variable//
    void Circle(){}
    CircleConstructor(Point center, double radius){
        this.center= center; //center of object = center in parameter
        this.radius= radius; //radius of object = radius in parameter

    }

    double getPerimiter()
    {
        return 2* Math.PI*radius;
    }
    double getRadius()
    {
        return radius;
    }
    double getArea()
    {
        return Math.PI*radius*radius;
    }
    void setCenter(Point center)
    {
        this.center=center;
    }
    void setRadius(double radius)
    {
        this.radius=radius;
    }
    public static void main(String[] args) {
        CircleConstructor c1 = new CircleConstructor(new Point(1,3) , 3);
        System.out.println(c1.getPerimiter());
        System.out.println(c1.getArea());

    }
}
