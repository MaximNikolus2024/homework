package lesson12.homework;

import java.util.Random;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("Приветствуем в 'Penny' ");
        String[] foodStaff = {
                "Хлеб",
                "Масло",
                "Колбаса",
                "Сыр",
                "Молоко",
                "Сливки",
                "Сливки (Взбитые)",
                "Кефир",
                "Ряженка",
                "Творог,с изюмом",
                "Фрукты",
                "Овощи",
                "Квас",
                "Сигареты"};
        double[] prises = {2,4,0.80,1,3.5};

        System.out.println("Введите название продукта:");

        Scanner scanner = new Scanner(System.in);
        String footCart = scanner.nextLine();

     int productIndex =-1;
     for (int i =0; i < foodStaff.length; i++){
         if (footCart.equalsIgnoreCase(foodStaff[i])){
             productIndex = i;
             break;
         }
         if (productIndex == -1){
             System.out.println("Продукт " + footCart + "Не найден");
         }else {
             System.out.println("Цена продукта: " +  prises[productIndex]);
         }

         







      }


    }
}
