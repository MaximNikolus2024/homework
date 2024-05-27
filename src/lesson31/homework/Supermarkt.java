package lesson31.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Supermarkt {
    public static void main(String[] args) {

        System.out.println("Приветствуем в Penny!");

        Map<String,Float> products = new HashMap<>();

        products.put("Хлеб", 1.20f);
        products.put("Масло",1.80f);
        products.put("Колбаса",1.50f);
        products.put("Сыр",2.20f);
        products.put("Молоко",2.20f);
        products.put(  "Сливки",1.50f);
        products.put("Сливки (Взбитые)",1.99f);
        products.put("Кефир",3.50f);
        products.put( "Ряженка",1.90f);
        products.put("Творог,с изюмом",2.30f);
        products.put( "Фрукты",3.50f);
        products.put("Овощи",2.15f);
        products.put( "Квас",2.99f);
        products.put("Сигареты",10.00f);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название продукта:");

        String nameOfProducts = scanner.nextLine();

        if (products.containsKey(nameOfProducts)){
            System.out.println("Ваш продукт: " + products.get(nameOfProducts) );
        }else {
            System.out.println("Такого продукта нет в наличии.");
        }
    }


}
