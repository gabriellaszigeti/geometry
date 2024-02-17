package com.codecool.geometry.display;

import java.util.concurrent.TimeUnit;

public class Display {

    public void mainMenu() {
        System.out.println("Choose an option:\n");
        System.out.println("1: Add new shape");
        System.out.println("2: Show all shapes");
        System.out.println("3: Show shape with the largest perimeter");
        System.out.println("4: Show shape with the largest area");
        System.out.println("5: Show formulas");
        System.out.println("0: Exit from program");
    }

    public void chooseShape() {
        System.out.println("Choose an option:\n");
        System.out.println("1: Circle");
        System.out.println("2: Triangle");
        System.out.println("3: Equilateral Triangle");
        System.out.println("4: Rectangle");
        System.out.println("5: Square");
        System.out.println("6: Regular pentagon");
    }

    public void quitGame() {
        System.out.println("Thanks for playing! Bye!");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("Interrupted "
                    + "while Sleeping");
        }
        System.exit(0);
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}