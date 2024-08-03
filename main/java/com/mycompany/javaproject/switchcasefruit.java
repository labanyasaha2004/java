package com.mycompany.javaproject;

import java.util.Scanner;

public class switchcasefruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit name: ");
        String fruit = input.nextLine();
        switch (fruit)
        {
            case "apple":
                System.out.println(" SWEET");
                case "orange":
                    System.out.println("ROUND");
                    case "banana":
                        System.out.println("HEALTHY");
                        case "grapefruit":
                            System.out.println("SOUR");
        }
    }
}
