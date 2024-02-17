package com.codecool.geometry.shapes;

public class Triangle extends Shape {

    private int base;
    private int verticalHeight;

    public Triangle(int base, int verticalHeight) {
        this.base = base;
        this.verticalHeight = verticalHeight;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * verticalHeight;
    }

    @Override
    public double calculatePerimeter() {
        return base + verticalHeight * 2;
    }

    @Override
    public String toString() {
        String representation = getClass().getSimpleName() + " base = " + base + " vertical height = " + verticalHeight; //This method returns the simple name of the underlying class
        return representation;
    }
}