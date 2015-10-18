package com.exp.dola.composite.solution;

public class Circle implements Shape {

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void print() {
        System.out.println("This is a Circle.");
    }
}
