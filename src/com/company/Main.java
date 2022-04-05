package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("1 + 2 = " + calc.add(1.0, 2.0));
        System.out.println("2 * 3 = " + calc.multiply(2.0, 3.0));
        System.out.println("4 - 2 = " + calc.subtract(4.0, 2.0));
        System.out.println("5 / 2 = " + calc.divide(5.0, 2.0));
        Double result =
                calc.divide(
                        calc.add(5.0, 2.0),
                        calc.subtract(
                                calc.multiply(3.0, 3.0)
                                , 2.0)
                );

        System.out.println("(5 + 2) / (3 * 3 - 2 ) = " + result);
        System.out.println("5 / 0 = " + calc.divide(5.0, 0.0));
    }
}
