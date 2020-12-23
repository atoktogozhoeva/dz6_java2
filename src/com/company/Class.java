package com.company;

public class Class <T extends Number> implements Interface{
    private T num1;
    private T num2;

    public Class(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate(Object value) {
        if (value == "+") {
            System.out.println(num1.doubleValue() + num2.doubleValue());
        } else if (value == "-") {
            System.out.println(num1.doubleValue() - num2.doubleValue());
        } else if (value == "/") {
            try {
                System.out.println(num1.doubleValue() / num2.doubleValue());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else if (value == "*") {
            System.out.println(num1.doubleValue() * num2.doubleValue());
        } else {
            System.out.println("Нет значений");
        }
    }
}