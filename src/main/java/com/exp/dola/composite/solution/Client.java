package com.exp.dola.composite.solution;

import java.util.Arrays;

/**
 * Created by udoluweera on 10/18/15.
 */
public class Client {

    public static void main(String[] args) {

        ComposedShape composedShape = new ComposedShape(Arrays.asList(new Circle(), new Square(), new Triangular()));
        composedShape.print();

    }
}
