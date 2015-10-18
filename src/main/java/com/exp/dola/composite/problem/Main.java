package com.exp.dola.composite.problem;

import java.util.Arrays;

/**
 * Created by udoluweera on 10/18/15.
 */
public class Main {

    public static void main(String[] args) {

        ComposedShape composedShape = new ComposedShape(Arrays.asList(new Circle(),new Circle()), Arrays.asList(new Square(),new Square()));



    }
}
