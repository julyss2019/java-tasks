package org.example;

public class Complex {
    private final double real;
    private final double vir;

    public Complex(double real, double vir) {
        this.real = real;
        this.vir = vir;
    }

    public Complex add(Complex complex) {
        return new Complex(this.real + complex.real, this.vir + complex.vir);
    }

    @Override
    public String toString() {
        return String.format("(%s + %si)", Utils.skipDotZero(real), Utils.skipDotZero(vir));
    }
}
