package org.example;

public class Complex {
    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complex add(Complex complex) {
        return new Complex(re + complex.re, im + complex.im);
    }

    public Complex subtract(Complex complex) {
        return new Complex(re - complex.re, im - complex.im);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        sb.append(re);
        sb.append(im >= 0 ? "+" : "-");
        sb.append(im);
        sb.append("i)");
        return sb.toString();
    }
}
