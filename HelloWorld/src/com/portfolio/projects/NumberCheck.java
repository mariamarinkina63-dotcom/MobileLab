package com.portfolio.projects;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите любое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("чёт");
        } else {
            System.out.println("нечёт");
        }

        if (number > 0) {
            System.out.println("положительное");
        } else if (number < 0) {
            System.out.println("отрицаельное");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}
