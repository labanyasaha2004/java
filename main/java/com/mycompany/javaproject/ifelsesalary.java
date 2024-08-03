package com.mycompany.javaproject;

public class ifelsesalary {
    public static void main(String[] args) {
        int salary = 25005;
        if(salary > 25000)
        {
            salary+= 2000;
        }
        else if(salary < 25000)
        {
            salary+= 1000;
        }
        else
        {
            salary+= 1500;
        }
        System.out.println("Salary is: " + salary);
    }
}
