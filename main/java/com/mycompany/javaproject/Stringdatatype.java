/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaproject;

/**
 *
 * @author labanya
 */
public class Stringdatatype {
    public static void main(String [] args)
    {
        String s1="Google";
        System.out.println(s1.toUpperCase());
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        int i = s1.length();
        System.out.println(i);
        String s3= "" ;
        System.out.println(s3.isEmpty());
        String s4= " " ;
        System.out.println(s3.isBlank());
        char c =s1.charAt(2);
        System.out.println(c);
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.lastIndexOf('o'));
        s1.concat("Chrome");
        System.out.println("Hi" + "Its" + "Me");

        


        
    }
    
}
