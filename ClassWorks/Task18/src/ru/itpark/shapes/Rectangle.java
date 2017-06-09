package ru.itpark.shapes;

import ru.itpark.Shape;

/**
 * Created by Student16 on 19.05.2017.
 */
public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double calcArea() {
        return x * y;
    }
}
