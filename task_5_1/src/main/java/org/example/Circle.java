package org.example;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Illegal radius");
        }

        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
