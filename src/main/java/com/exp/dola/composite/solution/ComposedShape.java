package com.exp.dola.composite.solution;

import java.util.List;

public class ComposedShape implements Shape {

    private List<Shape> shapes;

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public ComposedShape(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public String getName() {
        return "Composit Shape";
    }

    @Override
    public void print() {
        System.out.println("This is a Composed Shape, It has following shapes");
        for (Shape shape : shapes) {
            System.out.println( shape.getName() + " is in composed shape");
        }
    }
}
