package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
    }

    public boolean removeFigure(Shape shape) {
        return false;
    }

    public Shape getFigure(int n) {
        return null;
    }

    public String showFigures() {
       String s = "[";
       for (Shape shape : shapes) {
           s += shape.getShapeName() + ",";
       }
       s += "]";
       return s;
    }

}
