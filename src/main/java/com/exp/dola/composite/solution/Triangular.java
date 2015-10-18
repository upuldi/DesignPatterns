package com.exp.dola.composite.solution;

/**
 * Created by udoluweera on 10/18/15.
 */
public class Triangular implements Shape {
    @Override
    public String getName() {
        return "Triangular";
    }

    @Override
    public void print() {
        System.out.println("This is a triangular");

    }
}
