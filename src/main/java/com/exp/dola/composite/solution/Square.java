package com.exp.dola.composite.solution;

public class Square implements Shape {
    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public void print() {
        System.out.println("This is a Square");
    }
}
