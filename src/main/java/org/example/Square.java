package org.example;

import java.util.Scanner;

public class Square extends Shape{



    public void getAreaAndPerimeter() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the size of the square's side please");
        double yourSide = scanner1.nextDouble();

        Square square = new Square();
        square.getArea();
        double area = Math.pow(yourSide, 2);
        System.out.println("According to the given data the area of the square is " + area);

        square.getPerimeter();
        double perimeter = 4*yourSide;
        System.out.println("According to the given data the perimeter of the square is " + perimeter);
    }
}
