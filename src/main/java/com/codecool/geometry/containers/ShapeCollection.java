package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;

import java.util.*;

public class ShapeCollection {

    protected static ArrayList<Shape> list = new ArrayList<>();

    public void addShapes(Shape shape) {
        list.add(shape);
    }

    public static void printShapes() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            System.out.println(list.get(i));
        }

    }

    public static String getLargestPerimeter() {
        double shapeWithLargestPerimeter = list.get(0).calculatePerimeter();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).calculatePerimeter() > shapeWithLargestPerimeter) {
                shapeWithLargestPerimeter = list.get(i).calculatePerimeter();
            }
        }
        return String.valueOf(shapeWithLargestPerimeter);
    }


    public static String getLargestArea() {
        double shapeWithLargestArea = list.get(3).calculateArea();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).calculateArea() > shapeWithLargestArea) {
                shapeWithLargestArea = list.get(i).calculateArea();
                System.out.println(list.get(i));
            }
        }
        return String.valueOf(shapeWithLargestArea);
    }
}