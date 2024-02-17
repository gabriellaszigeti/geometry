package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    private int width;

    public Square(int width) {
        super(width, width);
        this.width = width;
    }
}