package com.portfolio.projects;

public class LoopsFor {
    public static void main(String[] args) {
        System.out.println("считаем от 1 до 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("число: "+ i);
        }

        System.out.println("обратный отсчёт: ");
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("только чётные числа от 1 до 20: ");
        for (int i=1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
