package com.mycompany.javaproject;

public class labprog15 {
    public static void main(String[] args)
    {
        ConstructorDemo C1= new ConstructorDemo(20,10);
        C1.sum();
        ConstructorDemo C2= new ConstructorDemo(30,10);
        C2.sum();
        ConstructorDemo C3=new ConstructorDemo();
        C3.sum();
    }
}
class ConstructorDemo
{
    int no1,no2;
    ConstructorDemo()
    {
        no1=no2=0;
    }
    ConstructorDemo(int a,int b)
    {
        no1=a;
        no2=b;
    }
    public void sum()
    {
        System.out.println(no1 + no2);
    }
}

