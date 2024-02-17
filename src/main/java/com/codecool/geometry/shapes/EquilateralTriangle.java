package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    private int base;

    public EquilateralTriangle(int base) {
        super(base, base);
        this.base = base;
    }

}