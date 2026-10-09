package org.example;

public class VectorMath {

    public static double length(Vector v) {
        return v.length();
    }

    public static double dot(Vector a, Vector b) {
        return a.dot(b);
    }

    public static double angleDegrees(Vector a, Vector b) {
        double dot = a.dot(b);
        double lenA = a.length();
        double lenB = b.length();

        if (lenA == 0 || lenB == 0) {
            throw new ArithmeticException("Угол с нулевым вектором не определён");
        }

        double cos = dot / (lenA * lenB);

        if (cos > 1) cos = 1;
        if (cos < -1) cos = -1;

        return Math.toDegrees(Math.acos(cos));
    }
}