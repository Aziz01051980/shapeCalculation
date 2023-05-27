package org.example;

import java.util.Scanner;

public class Triangle extends Shape{

    public void getAreaAndPerimeter() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the triangle first side's size");
        double yourFirstSide = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the triangle second side's size");
        double yourSecondSide = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the triangle base's size");
        double base = scanner2.nextDouble();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter the triangle's height");
        double height = scanner4.nextDouble();

        Triangle triangle = new Triangle();
        triangle.getArea();
        double area = (height*base)/2;
        System.out.println("According to the given data the area of the square is " + area);

        triangle.getPerimeter();
        double perimeter = base + yourFirstSide + yourSecondSide;
        System.out.println("According to the given data the perimeter of the square is " + perimeter);
    }
}
