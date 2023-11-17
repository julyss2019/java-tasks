public abstract class Shape {
    abstract String getName();

    abstract double getArea();

    @Override
    public String toString() {
        return String.format("%s面积: %s", getName(), getArea());
    }
}
