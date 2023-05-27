package org.example;

import java.util.Scanner;

public class Circle extends Shape{

    protected double Pi = 3.14;

    public void getAreaAndPerimeter(){

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your radius please");
        double yourRadius = scanner1.nextDouble();

        Circle circle = new Circle();
        circle.getArea();
        double area = Pi*Math.pow(yourRadius, 2);
        System.out.println("According to the given data the area of the circle is " + area);

        circle.getPerimeter();
        double perimeter = 2*Pi*yourRadius;
        System.out.println("According to the given data the perimeter of the circle is " + perimeter);
    }





}
