public class Circle extends Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * r * r;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
