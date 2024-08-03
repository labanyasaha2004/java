package com.mycompany.javaproject;
import java.util.Scanner;
public class celciustofahrenheit
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the temperature in celcius: ");
        float c = s.nextFloat();
        float f = (c * 9/5)+ 32;
        System.out.println("Temperature in fahrenheit is : " + f);
        if (f>86)
        {
            System.out.println("The weather is hot");
        }
        else
        {
            System.out.println("The weather is cool");
        }
    }
}

