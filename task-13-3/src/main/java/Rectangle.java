public class Rectangle extends Shape{
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("width=").append(width);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }
}
