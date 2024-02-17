package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {

    private int side;

    public RegularPentagon(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 0.25 * (Math.sqrt(5 * (5 + 2 * Math.sqrt(5) * side * side)));
    }

    @Override
    public double calculatePerimeter() {
        return side * 5;
    }

    @Override
    public String toString() {
        String representation = getClass().getSimpleName() + "side = " + side;
        return representation;
    }
}