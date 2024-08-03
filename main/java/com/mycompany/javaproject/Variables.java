
package com.mycompany.javaproject;

public class Variables {
    public static void main(String[] args)
    {
        String myName; //declaration 
        myName = "Labanya Saha" ; //assignment
        String myNameCopy = myName ;
        String myAge = "20" ; //initialization
        System.out.println(myName);
        System.out.println(myAge);
        myAge= "Another age" ; //replacing and not redeining
        System.out.println(myNameCopy);  // copy value of one variable to another
        System.out.println(myAge);
    }
    
}
