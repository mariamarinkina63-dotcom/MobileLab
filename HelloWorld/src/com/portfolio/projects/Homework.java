package com.portfolio.projects;

public class Homework {
    public static void main(String[] argv){
        String name = "iPhone 15";
        double price = 999.99;
        int quantity = 15;
        double discount = 10.0;
        boolean delivery = true;

        System.out.println("=== КАРТОЧКА ТОВАРА ===");
        System.out.println("Название: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Количество: " + quantity);
        System.out.println("Скидка: " + discount);
        System.out.println(("Доставка доступна: "+ delivery));
    }
}
