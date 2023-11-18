public final class Test {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(10, 5);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
