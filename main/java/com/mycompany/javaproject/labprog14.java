package com.mycompany.javaproject;
public class labprog14 {
    int Id;
    String Name;
    labprog14()
    {
        Id=10;
        Name="Labanya Saha";
    }
    void info()
    {
        System.out.println("Id"+ " " + Id );
        System.out.println("Name" + " " + Name);
    }

    public static void main(String [] args)
    {
        labprog14 ob=new labprog14();
        ob.info();
    }
}