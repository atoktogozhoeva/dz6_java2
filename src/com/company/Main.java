package com.company;

public class Main {

        public static void main(String[] args) {
            Class<Double> valueFirst = new Class<>(4.0,8.0);
            valueFirst.calculate("+");
            valueFirst.calculate("-");

            Class<Integer> valueSecond = new Class<>(6,2);
            valueFirst.calculate("*");
            valueFirst.calculate("/");
    }
}
