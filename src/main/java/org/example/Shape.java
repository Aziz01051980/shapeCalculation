package org.example;

import java.util.Scanner;



public class Shape {

    public void getArea(){
        System.out.println("We are calculating area of the shape");
    }

    public void getPerimeter(){
        System.out.println("We are calculating the perimeter of the shape");
    }

    public static void getNameOfShape() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please the figure or shape and we will calculate for you " +
                "its perimeter and area: triangle, circle, cylinder, square, " +
                " or rectangle");
        String yourShape = scanner.nextLine();

        switch (yourShape){
            case "circle":
                Circle circle = new Circle();
                circle.getAreaAndPerimeter();
                break;
            case "square":
                Square square = new Square();
                square.getAreaAndPerimeter();
                break;
            case "rectangle":
                Rectangle rectangle = new Rectangle();
                rectangle.getAreaAndPerimeter();
                break;
            case "cylinder":
                Cylinder cylinder = new Cylinder();
                cylinder.getAreaAndPerimeter();
                break;
            case "triangle":
                Triangle triangle = new Triangle();
                triangle.getAreaAndPerimeter();
                break;
            default:
                System.out.println("Wrong data input, enter the name of the shape again please");
        }
    }
}

