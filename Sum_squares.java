package com.company;

public class Sum_squares {

    private static int square_sum = 0 ;
    private static int number_sum = 0;

    private static int square = 2;

    public static void setSquare_sum(int square_sum) {
        Sum_squares.square_sum = square_sum;
    }

    public static void setNumber_sum(int number_sum) {
        Sum_squares.number_sum = number_sum;
    }

    public static void sum_square(){

            for(int i=1; i<=100; i++)
        {
            square_sum += Math.pow(i,square);
        }
    }

    public static void sum_numbers(){
        for(int i=0; i<=100 ; i++ ){
            number_sum += i;
        }
        number_sum =((int)Math.pow(number_sum,square));
        }

    public static void display_sum (){
        int sum = square_sum;
        int square_sum = number_sum;

        System.out.println(square_sum - sum);

    }
}
