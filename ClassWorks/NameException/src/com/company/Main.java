package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Name:");
            String name = scanner.next();
            System.out.println("Surname:");
            String surname = scanner.next();

            PersonDataVerifier verifier = new PersonDataVerifier();
            try {
                verifier.verifyName(name, surname);
                break;
            } catch (IncorrectNameOrSurname e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
