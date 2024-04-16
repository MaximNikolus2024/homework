package lesson13.homework;

import java.util.Scanner;

public class Main02 {

    public static double toCelsius(double degrees) {
        return degrees - 32 * 5 / 9;
    }

    public static double toFahrenheit(double degrees) {
        return degrees * 1.8 + 32;
    }

    public static void main(String[] args) {
        System.out.println("Приветствуем в переводчике Цельсия в Фаренгейт!");

        System.out.println("Выберете в какую градусную меру вы хотите перевести: " +
                "1. Цельсий в Фаренгейт 2. Фаренгейт в Цельсий.");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        System.out.println("Сколько градусов вы хотите перевести?");
        int amount = scanner.nextInt();

        System.out.println(userChoice == 1 ? toFahrenheit(amount) : toCelsius(amount));
    }
}
