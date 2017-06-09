package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car("BMW", 777, 100, 15);
        System.out.println(car.getAverageFuelPerKm());
    }
}
