package com.company;

public class Main {

    public static void main(String[] args) {
        HomeBook book = HomeBook.getInstance();
        book.saveHuman("kjslkgj");

        HomeBook book1 = HomeBook.getInstance();

        book1.saveHumanAndAddress("khtwheh", 195.3);
    }
}
