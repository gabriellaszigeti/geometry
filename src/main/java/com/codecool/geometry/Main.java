package com.codecool.geometry;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.*;
import com.codecool.geometry.display.Display;
import com.codecool.geometry.utilities.FormulaProvider;

public class Main {

    private static ShapeCollection shapes = new ShapeCollection();
    private static Display display = new Display();


    public static void main(String[] args) {

        boolean isRunning = true;
        display.mainMenu();
        while (isRunning) {
            Shape circle = new Circle(5);
            Shape equilateralTriangle = new EquilateralTriangle(10);
            Shape rectangle = new Rectangle(4, 8);
            Shape regularPentagon = new RegularPentagon(5);
            Shape square = new Square(8);
            Shape triangle = new Triangle(4, 7);
            shapes.addShapes(circle);
            shapes.addShapes(equilateralTriangle);
            shapes.addShapes(rectangle);
            shapes.addShapes(regularPentagon);
            shapes.addShapes(square);
            shapes.addShapes(triangle);
            int option = getUserMenuChoiceInt();
            switch (option) {
                case 1:
                    // TODO Add new shape
                    display.chooseShape();
                    getUserMenuChoiceString();
                    break;
                case 2:
                    ShapeCollection.printShapes();
                    break;
                case 3:
                    // TODO Show shape with the largest perimeter
                    System.out.println(ShapeCollection.getLargestPerimeter());
                    break;
                case 4:
                    // TODO Show shape with the largest area
                    System.out.println(ShapeCollection.getLargestArea());
                    break;
                case 5:
                    // TODO Show formulas
                    display.chooseShape();
                    String choice = getUserMenuChoiceString();
                    System.out.println(choice + " area: " + FormulaProvider.getAreaForShape(choice) + " perimeter: " + FormulaProvider.getPerimeterForShape(choice));
                    break;
                case 0:
                    display.quitGame();
                    break;
            }
            display.mainMenu();
        }
    }

    private static int getUserMenuChoiceInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getUserMenuChoiceString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}