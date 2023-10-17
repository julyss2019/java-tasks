package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            int type = inputType(scanner);

            if (type == 1) {
                double a = inputDouble(scanner);
                double b = inputDouble(scanner);

                System.out.printf("%s + %s = %s%n", Utils.skipDotZero(a), Utils.skipDotZero(b), Utils.skipDotZero(a + b));
            } else {
                Complex a = inputComplex(scanner);
                Complex b = inputComplex(scanner);

                System.out.printf("%s + %s = %s%n", a, b, a.add(b).toString());
            }
        }
    }

    private static Complex inputComplex(Scanner scanner) {
        // 1+2i
        // 1-2i
        System.out.printf("请输入复数: ");

        while (true) {
            String expression = scanner.next();

            if (!expression.endsWith("i")) {
                System.out.println("无效的复数表达式");
                continue;
            }

            String splitStr = "-";
            int opIndex = expression.lastIndexOf("-");

            if (opIndex == -1) {
                splitStr = "\\+";
                opIndex = expression.lastIndexOf("+");
            }

            if (opIndex == -1) {
                System.out.println("无效的复数表达式");
                continue;
            }

            String[] array = expression.split(splitStr);
            String aStr = array[0];
            String bStr = array[1].substring(0, array[1].length() - 1);

            if (!isValidDouble(aStr) || !isValidDouble(bStr)) {
                System.out.println("无效的复数表达式");
                continue;
            }

            return new Complex(Double.parseDouble(aStr), Double.parseDouble(bStr));
        }
    }

    private static boolean isValidDouble(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    private static double inputDouble(Scanner scanner) {
        System.out.print("请输入小数或整数: ");

        return scanner.nextDouble();
    }

    public static int inputType(Scanner scanner) {
        System.out.println("请输入要计算的类型: ");
        System.out.println("1. 小数或整数");
        System.out.println("2. 复数, e.g. 1+2i, 3.0+5.0i");
        int n;

        while ((n = scanner.nextInt()) != 1 && n != 2) {
            System.out.println("请输入合法的计算类型.");
        }

        return n;
    }
}