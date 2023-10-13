package mypackage;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入温度: ");
        double temp = scanner.nextDouble();
        System.out.printf("对应的摄氏温度为: %f", (temp - 32) * 5 / 9);
    }
}
