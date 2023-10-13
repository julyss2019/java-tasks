package org.example;

public class ForAndWhile {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        int i = 1;
        int sum1 = 0;

        while (i <= 100) {
            sum1 += i++;
        }

        System.out.println(sum);
        System.out.println(sum1);
    }
}
