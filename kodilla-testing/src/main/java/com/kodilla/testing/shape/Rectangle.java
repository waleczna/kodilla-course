package com.kodilla.testing.shape;

class Rectangle implements Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
