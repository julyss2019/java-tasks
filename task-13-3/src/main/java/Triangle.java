public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return base * height * 0.5;
    }

    @Override
    double getPerimeter() {
        return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
}
