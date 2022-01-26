package com.company;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private static int divisor_1 = 3;
    private static int divisor_2 = 5;
    private static double sum =0;
    private static List <Integer> list = new ArrayList<>();

    public static void setSum(double sum) {
        Numbers.sum = sum;
    }

    public static double getSum() {
        return sum;
    }

    public static void setList(List<Integer> list) {
        Numbers.list = list;
    }

    public static void display_array(){
        for (int i = 1; i < 1000; i++) {
            list.add(i);
        }
        for (int lista: list) {
            if(lista%3 == 0  || lista %5 == 0) {
                sum += lista;
                }
             }
    }
}


