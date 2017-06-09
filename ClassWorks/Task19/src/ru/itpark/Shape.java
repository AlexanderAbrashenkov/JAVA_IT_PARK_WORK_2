package ru.itpark;

/**
 * Created by Student16 on 19.05.2017.
 */
public abstract class Shape {

    public abstract double calcArea();

    public abstract double calcPerimeter();

    public boolean equals(Shape shape) {
        return this.calcArea() == shape.calcArea()
                && this.calcPerimeter() == shape.calcPerimeter();
    }
}
