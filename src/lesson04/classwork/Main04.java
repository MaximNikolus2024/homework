package lesson04.classwork;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор роста! Введите ваш рот:");
        int height = scanner.nextInt();
        System.out.println("Ваш рост: " + height + " см. спавсибо!");
    }
}
