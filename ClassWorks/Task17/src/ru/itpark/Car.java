package ru.itpark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Student16 on 12.05.2017.
 */
public class Car {
    private String model;
    private int num;
    private int kilometrage;
    private int fuel;

    public Car() {
        this.model = "UNDEFINED";
        this.num = 111;
        this.kilometrage = 1;
        this.fuel = 1;
    }

    public Car(String model, int num, int kilometrage, int fuel) {
        this.model = model;
        this.num = num;
        this.kilometrage = kilometrage;
        this.fuel = fuel;
    }

    public Car(Car car) {
        this.model = car.model;
        this.num = car.num;
        this.kilometrage = car.kilometrage;
        this.fuel = car.fuel;
    }

    public double getAverageFuelPerKm() {
        return fuel * 1.0 / kilometrage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    LinkedList<Integer> linkedList = new LinkedList<>();

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (num != car.num) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + num;
        return result;
    }
}
