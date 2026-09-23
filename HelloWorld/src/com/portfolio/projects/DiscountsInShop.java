package com.portfolio.projects;

import java.util.Scanner;

public class DiscountsInShop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Товар: ");
        String thing = scanner.nextLine();

        System.out.print("цена без скидки: ");
        double cost = scanner.nextDouble();

        System.out.print("скидка: ");
        double discount = scanner.nextDouble();

        System.out.print("итоговая цена: " + (cost * (100 - discount)/100));
        scanner.close();
    }

}
