package com.vbc.type.innerclasses.staticinnerclass;

public class Outer {
    static class StaticNested {
        void display() {
            System.out.println("Static nested class method");
        }
    }

    public static void main(String[] args) {
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.display();  // Output: Static nested class method
    }
}