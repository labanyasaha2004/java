package com.mycompany.javaproject;

import java.util.Scanner;

public class switchcase_7days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of week");
        int day = input.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Sunday");
//                case 2:
//                    System.out.println("Monday");
//                    case 3:
//                        System.out.println("Tuesday");
//                        case 4:
//                            System.out.println("Wednesday");
//                            case 5:
//                                System.out.println("Thursday");
//                                case 6:
//                                    System.out.println("Friday");
//                                    case 7:
//                                        System.out.println("Saturday");
//            default:
//                System.out.println("please enter a valid day");
//        }

        switch (day) {
            case 1,2,3,4,5: System.out.println("Weekday");
            break;
            case 6,7: System.out.println("Weekend");
        }
    }
}
