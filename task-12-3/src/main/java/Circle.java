public class Circle extends Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    String getName() {
        return "圆";
    }
}
