package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入: ");
        System.out.println(isWaterFlower(scanner.nextInt()) ? "是水仙花数" : "不是水仙花数");

        for (int i = 100; i < 1000; i++) {
            if (isWaterFlower(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isWaterFlower(int n) {
        //noinspection IntegerDivisionInFloatingPointContext
        return (int) (Math.pow(n / 100, 3) + Math.pow(n / 10 % 10, 3) + Math.pow(n % 10, 3)) == n;
    }
}