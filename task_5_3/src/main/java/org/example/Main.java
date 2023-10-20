package org.example;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(1, 5);

        System.out.println(coordinate.move(1, -3));
        System.out.println(coordinate.distance(new Coordinate(3, 4)));
    }
}