package ru.itpark;

import ru.itpark.shapes.Rectangle;
import ru.itpark.shapes.Square;
import ru.itpark.shapes.Trapezium;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Shape[] shapes = {
                new Square(11),
                new Rectangle(10, 12),
                new Trapezium(4, 6, 2)
        };

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.print(shape.getClass().getSimpleName() + ", area = " + shape.calcArea() + ", perimeter = " + shape.calcPerimeter() + "\n");
        }

    }
}
