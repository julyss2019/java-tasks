package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);

        System.out.println("r: " + circle.getRadius());
        System.out.println("area: " + circle.calcArea());
    }
}