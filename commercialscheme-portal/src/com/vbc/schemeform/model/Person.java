package com.vbc.schemeform.model;

public class Person {
    public String firstName;
    public String lastName;
    public String age;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
