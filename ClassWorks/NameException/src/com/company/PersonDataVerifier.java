package com.company;

/**
 * Created by Student2 on 23.06.2017.
 */
public class PersonDataVerifier {
    public void verifyName(String name, String surname) throws IncorrectNameOrSurname {
        if (!Character.isUpperCase(name.charAt(0)) || !Character.isUpperCase(surname.charAt(0))) {
            throw new IncorrectNameOrSurname("Incorrect name or surname");
        }
    }
}
