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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("r=").append(r);
        sb.append('}');
        return sb.toString();
    }
}
