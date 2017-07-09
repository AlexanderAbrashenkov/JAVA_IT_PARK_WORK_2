package ru.itpark;

/**
 * Created by Student16 on 09.07.2017.
 */
public class HumanWithPet implements Human {
    private String name;
    private Pet pet;

    public HumanWithPet(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public void walk() {
        System.out.println(name + " гуляет с животным. " + pet.getClass().getSimpleName() + ": " + pet.saySomething());
    }
}
