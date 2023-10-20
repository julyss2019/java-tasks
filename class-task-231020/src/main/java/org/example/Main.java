package org.example;

public class Main {
    public static void main(String[] args) {
        Complex complex = new Complex(1, 2);

        System.out.println(complex.add(new Complex(3, 4)));
        System.out.println(complex.subtract(new Complex(2, 6)));
        System.out.println(complex.multiply(new Complex(2, 6)));
    }
}