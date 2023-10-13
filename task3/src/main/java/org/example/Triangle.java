package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sides = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入边 " + (i + 1) + ": ");
            sides[i] = scanner.nextInt();
        }

        // 从小到大排序
        Arrays.sort(sides);

        // 最小的两个边的和要大于最大的边
        if (sides[0] + sides[1] <= sides[2]) {
            System.out.println("不满足任意两边之和大于第三边, 不是合法的三角形.");
            return;
        }

        // 最小的两个的平方要等于最大的平方
        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) != Math.pow(sides[2], 2)) {
            System.out.println("不满足 a^2 + b^2 = c^2, 不是合法的直角三角形.");
            return;
        }

        System.out.println("面积: " + sides[0] * sides[1] * 0.5);
    }
}
