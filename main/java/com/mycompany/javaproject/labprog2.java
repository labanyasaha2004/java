package com.mycompany.javaproject;

public class labprog2 {

    public static void main(String[] args) {
        Person person = new Person("Labanya Saha");
       
        person.printName();
    }


    public static class Person {
        private String name;
        public Person(String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println("My name is " + name);
        }
    }
}