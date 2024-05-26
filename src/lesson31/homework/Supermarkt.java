package lesson31.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Supermarkt {
    public static void main(String[] args) {

        System.out.println("риветствуем в Penny!");

        Map<String,Double> products = new HashMap<>();

        products.put("Хлеб", 1.20);
        products.put("Масло",1.80);
        products.put("Колбаса",1.50);
        products.put("Сыр",2.20);
        products.put("Молоко",2.20);
        products.put(  "Сливки",1.50);
        products.put("Сливки (Взбитые)",1.99);
        products.put("Кефир",3.50);
        products.put( "Ряженка",1.90);
        products.put("Творог,с изюмом",2.30);
        products.put( "Фрукты",3.50);
        products.put("Овощи",2.15);
        products.put( "Квас",2.99);
        products.put("Сигареты",10.00);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта:");

        String nameOfProducts = scanner.next();

        if (products.containsKey(nameOfProducts)){
            System.out.println("Ваш продукт: " + products.get(products));
        }else {
            System.out.println("Такого продукта нет в наличии.");
        }
    }


}
