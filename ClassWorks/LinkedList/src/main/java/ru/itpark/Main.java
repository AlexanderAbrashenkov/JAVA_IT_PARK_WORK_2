package ru.itpark;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Marsel");
        linkedList.add("Alina");
        linkedList.add("Regina");
        linkedList.add("Rinata");
        linkedList.add("Alesya");
        linkedList.add("Elena");

        linkedList.addToBegin("123");
        linkedList.addToBegin("12");
        linkedList.addToBegin("1");


    }
}
