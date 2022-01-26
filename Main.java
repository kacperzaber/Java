package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Zadanie 1:");
        System.out.println("");

        Sum_squares.sum_square();
        Sum_squares.sum_numbers();
        Sum_squares.display_sum();

        System.out.println("");

        System.out.println("Zadanie 6:");
        System.out.println("");

        Numbers.display_array();

        System.out.println("Suma wszystkich wielokrotności 3 lub 5 poniżej 1000 wynosi: ");
        System.out.println((int)Numbers.getSum());
    }
}
