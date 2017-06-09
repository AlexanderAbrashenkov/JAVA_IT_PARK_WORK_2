package ru.itpark.shapes;

import ru.itpark.Shape;

/**
 * Created by Student16 on 19.05.2017.
 */
public class Trapezium extends Shape {

    private int top;
    private int bottom;
    private int height;

    public Trapezium(int top, int bottom, int height) {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (top + bottom) / 2 * height;
    }
}
