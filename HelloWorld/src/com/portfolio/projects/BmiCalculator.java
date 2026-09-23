package com.portfolio.projects;

import java.util.Scanner; // подключаем сканер

public class BmiCalculator {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in); // Создаем сканер

        System.out.print("введите имя: ");
        String name = scanner.nextLine();

        System.out.print("введите вес: ");
        double weight = scanner.nextDouble();

        System.out.print("введите рост в метрах: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("результат для " + name);
        System.out.println(" ваш bmi: " + bmi);

        if (bmi < 18.5){
            System.out.println("у вас недостаточный вес");
        } else if (bmi >- 18.5 && bmi < 25){
            System.out.println("хороший вес");
        }else{
            System.out.println("избыточный вес");
        }
        scanner.close();
    }
}
