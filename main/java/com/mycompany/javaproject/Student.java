package javaapplication1;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student std) {
        this.name = std.name;
        this.age = std.age;
    }

    public void displayData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.close();  // Close the Scanner

        Student std = new Student(name, age);
        std.displayData();

        Student copyofstd = new Student(std);
        copyofstd.displayData();
    }
}