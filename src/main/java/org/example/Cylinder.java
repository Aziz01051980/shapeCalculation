package org.example;

import java.util.Scanner;

public class Cylinder extends Shape{

    protected double Pi = 3.14;
    public void getAreaAndPerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder please");
        double radius = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the height of the cylinder please");
        double height = scanner1.nextDouble();

        Cylinder cylinder = new Cylinder();
        cylinder.getArea();
        double area = Pi*height*Math.pow(radius, 2);
        System.out.println("According to the given data the area of the cylinder is " + area);

        cylinder.getPerimeter();
        double perimeter = (4*radius) + (2*height);
        System.out.println("According to the given data the perimeter of the cylinder is " + perimeter);
    }




}
