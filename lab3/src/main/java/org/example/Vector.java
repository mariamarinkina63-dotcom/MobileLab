package org.example;

import java.util.Arrays;

public class Vector {
    private double[] components;

    public Vector(double... components) {
        this.components = components.clone();
    }

    public int size() {
        return components.length;
    }

    public double get(int index) {
        if (index < 0 || index >= components.length) {
            throw new IndexOutOfBoundsException("Индекс " + index + " вне диапазона");
        }
        return components[index];
    }

    public void set(int index, double value) {
        if (index < 0 || index >= components.length) {
            throw new IndexOutOfBoundsException("Индекс " + index + " вне диапазона");
        }
        components[index] = value;
    }

    public Vector increment() {
        for (int i = 0; i < components.length; i++) {
            components[i] += 1;
        }
        return this;
    }

    public Vector decrement() {
        for (int i = 0; i < components.length; i++) {
            components[i] -= 1;
        }
        return this;
    }

    public double length() {
        double sum = 0;
        for (double c : components) {
            sum += c * c;
        }
        return Math.sqrt(sum);
    }

    public double dot(Vector other) {
        if (this.size() != other.size()) {
            throw new IllegalArgumentException("Векторы разной размерности");
        }
        double sum = 0;
        for (int i = 0; i < components.length; i++) {
            sum += this.components[i] * other.components[i];
        }
        return sum;
    }

    @Override
    public String toString() {
        return Arrays.toString(components);
    }
}