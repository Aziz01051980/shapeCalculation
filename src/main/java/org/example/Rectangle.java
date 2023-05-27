package org.example;

import java.util.Scanner;

public class Rectangle extends Shape{
    public void getAreaAndPerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle please");
        double width = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle please");
        double height = scanner1.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.getArea();
        double area = height*width;
        System.out.println("According to the given data the area of the square is " + area);

        rectangle.getPerimeter();
        double perimeter = 2*(height+width);
        System.out.println("According to the given data the perimeter of the square is " + perimeter);
    }
}
