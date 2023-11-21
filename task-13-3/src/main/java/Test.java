public class Test {
    public static void main(String[] args) {
        test(new Circle(10));
        test(new Rectangle(3, 4));
        test(new Triangle(3, 4));
    }

    private static void test(Shape shape) {
        System.out.println(String.format("%s 周长: %f, 面积: %f", shape.getClass().getSimpleName(), shape.getPerimeter(), shape.getArea()));
    }
}
