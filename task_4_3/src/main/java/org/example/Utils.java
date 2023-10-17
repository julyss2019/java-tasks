package org.example;

public class Utils {
    public static String skipDotZero(double d) {
        return String.valueOf(d).replaceAll("\\.0+$", "");
    }
}
