package ru.itpark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /**
     * Переменная глобальная для addToEndOfArray
     * и для main
     */
    public static int count = 0;
    /**
     * Процедура добавления элемента в массив
     * @param a - массив, куда надо добавить элемент
     * @param value - значение, которое нужно добавить
     */
    public static void addToEndOfArray(int a[], int value) {
        addToIndexOfArray(a, value, count);
    }

    public static void addToIndexOfArray(int a[], int value, int index) {
        for (int i = count; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = value;
        count++;
    }

    /**
     * Кладет значение в начало массива
     * @param a
     * @param value
     */
    public static void addToBeginOfArray(int a[], int value) {
        addToIndexOfArray(a, value, 0);
    }

    public static void removeByIndex(int a[], int index) {
        for (int i = index; i < count; i++) {
            a[i] = a[i + 1];
        }
        count--;
    }

    public static void removeByValue(int[] a, int value) {
        while (indexOf(a, value) != -1) {
            removeByIndex(a, indexOf(a, value));
        }
    }

    public static int indexOf(int a[], int value) {
        for (int i = 0; i < count; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /*int animalsWeight[] = new int[10];
        *//*
        animalsWeight[0] = 13;
        animalsWeight[1] = 15;
        animalsWeight[2] = 11;
        animalsWeight[3] = 8;
        animalsWeight[4] = 9;
        *//*
        addToEndOfArray(animalsWeight, 13);
        addToEndOfArray(animalsWeight, 15);
        addToEndOfArray(animalsWeight, 11);
        addToEndOfArray(animalsWeight, 8);
        addToEndOfArray(animalsWeight, 9);
        addToBeginOfArray(animalsWeight, 100);
        addToEndOfArray(animalsWeight, 777);
        addToIndexOfArray(animalsWeight, 123, 3);
        removeByIndex(animalsWeight, 4);

        for (int i = 0; i < count; i++) {
            System.out.println(animalsWeight[i]);
        }*/
        System.out.println(fib(0, 1, 10));

        List<Integer> list = new LinkedList<>();

    }

    public static int fib(int x1, int x2, int n) {
        int x3;
        if (n > 1) {
            x3 = x2 + x1;
            x1 = x2;
            x2 = x3;
            return fib(x1, x2, n-1);
        } else {
            return x2;
        }
    }
}
