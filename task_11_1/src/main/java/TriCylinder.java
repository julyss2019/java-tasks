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

    public double findArea() {
        return 3 * (Math.sqrt(3) * Math.pow(side, 2)) / 4 + 3 * side * height;
    }
}
