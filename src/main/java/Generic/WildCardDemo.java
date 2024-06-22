package Generic;

import java.util.LinkedList;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args) {

        // ?
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Circle(1));
        shapes.add(new Square(1));
        // printSize(shapes);




        // ? extend T
        List<Circle> circles = new LinkedList<>();
        shapes.add(new Circle(1));
        shapes.add(new Circle(2));
        printArea(shapes);


        // ? super T
    }

    public static void printSize(List<?> shapes) {
        System.out.println(shapes.size());
    }

    public static void printArea(List<? extends Shape>  shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle " + shape.area());
            }  else {
                System.out.println("Square" + shape.area());
            }
        }
    }



}
