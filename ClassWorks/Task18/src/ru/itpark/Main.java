package ru.itpark;

import ru.itpark.shapes.Rectangle;
import ru.itpark.shapes.Square;
import ru.itpark.shapes.Trapezium;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(12),
                new Rectangle(10, 11),
                new Trapezium(4, 6, 2)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calcArea());
        }
    }
}
