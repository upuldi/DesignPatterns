package com.exp.dola.composite.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Composed object is consist of other shapes like Circle and Square.
 * So Whenever a new object is added to the structure the composed object need to have a reference to it.
 */
public class ComposedShape {

    /**
     * Each time when you add a new shape, it has to be updated in all the composed shaped which could make use of these new shapes.
     *
     */

    private List<Circle> circleList = new ArrayList<Circle>();
    private List<Square> squareList = new ArrayList<Square>();


    public ComposedShape(List<Circle> circleList, List<Square> squareList) {
        this.circleList = circleList;
        this.squareList = squareList;
        System.out.printf("This is a composed object with %d Circles and %d Squares.", circleList.size(), squareList.size());
    }
}
