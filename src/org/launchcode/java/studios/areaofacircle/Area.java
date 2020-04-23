package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input; // Comments do not have to start at the beginning of a line.

        input = new Scanner(System.in);
        System.out.println("Enter a Radius: ");
        double radius  = input.nextFloat();
        input.close();

        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        }
    }
