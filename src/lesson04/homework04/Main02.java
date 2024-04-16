package lesson04.homework04;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вес в килограммах: ");
        float weight = scanner.nextFloat();
        System.out.println("Введите ваш рост в метрах: ");
        float height = scanner.nextFloat() /100f;
        float res = weight / ( height * height);
        System.out.println("Индекс массы тела равен : " + res);
    }
}

