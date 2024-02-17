package com.codecool.geometry.shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        String representation = getClass().getSimpleName() + " radius = " + radius;
        return representation;
    }
}