
package com.mycompany.javaproject;
import java.util.*;
public class labprog10 {
      public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a five-digit number");
        int number=sc.nextInt();
        int digit1=number/10000;
        int digit2=(number/1000)%10;
        int digit3=(number/100)%10;
        int digit4=(number/10)%10;
        int digit5=number%10;
        System.out.println(digit1+" "+digit2+" "+digit3+" "+digit4+" "+digit5);
    }  
}
