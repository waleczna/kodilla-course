package com.kodilla.testing.shape;

class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
