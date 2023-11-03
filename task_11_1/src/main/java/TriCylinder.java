public class TriCylinder {
    private double side;
    private double height;

    public TriCylinder(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 表面积 = 2 * [(底边长) * (底边长) * (根号3 / 4)] + 3 * (底边长) * (高)
    public double findArea() {
        return 2 * (Math.pow(side, 2) * Math.sqrt(3) / 4) + 3 * side * height;
    }
}
