package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введите m — количество векторов: ");
        int m = sc.nextInt();

        System.out.print("Введите n — размерность векторов: ");
        int n = sc.nextInt();

        System.out.print("Заполнить случайно (1) или вручную (2)? ");
        int mode = sc.nextInt();

        Vector[] vectors = new Vector[m];

        for (int i = 0; i < m; i++) {
            double[] comps = new double[n];
            for (int j = 0; j < n; j++) {
                if (mode == 1) {
                    comps[j] = rnd.nextInt(11) - 5;
                } else {
                    System.out.print("Вектор " + (i + 1) + ", компонента " + (j + 1) + ": ");
                    comps[j] = sc.nextDouble();
                }
            }
            vectors[i] = new Vector(comps);
        }

        System.out.println("\nИсходные векторы:");
        for (int i = 0; i < m; i++) {
            System.out.println("v" + (i + 1) + " = " + vectors[i]
                    + ", длина = " + VectorMath.length(vectors[i]));
        }

        System.out.println("\nДемонстрация increment/decrement:");
        Vector demo = new Vector(new double[vectors[0].size()]);
        for (int k = 0; k < vectors[0].size(); k++) demo.set(k, vectors[0].get(k));
        System.out.println("Было:      " + demo);
        demo.increment();
        System.out.println("После ++:  " + demo);
        demo.decrement();
        System.out.println("После --:  " + demo);

        System.out.println("\nСкалярные произведения, длины и углы для всех пар векторов:");
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                Vector a = vectors[i];
                Vector b = vectors[j];

                System.out.printf(
                        "Пара (v%d, v%d): скалярное = %.3f, |v1| = %.3f, |v2| = %.3f, угол = %.2f°%n",
                        i + 1, j + 1,
                        VectorMath.dot(a, b),
                        VectorMath.length(a),
                        VectorMath.length(b),
                        VectorMath.angleDegrees(a, b)
                );
            }
        }
    }
}