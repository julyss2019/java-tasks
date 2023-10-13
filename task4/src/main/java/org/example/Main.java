package org.example;

public class Main {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 100; i++) {
            double tmp = 1 / (double) i;

            sum += i % 2 == 0 ? -tmp : tmp;
        }

        System.out.println(sum);

        for (int i = 0; i < 5; i++) {
            for (int x = 0; x <= i; x++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}