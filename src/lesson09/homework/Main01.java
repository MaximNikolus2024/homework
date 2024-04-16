package lesson09.homework;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum;
        int counter = 0;
        do {
            System.out.println("Введите натуральное число:");
            userNum = scanner.nextInt();
            counter++;
        }while (userNum <= 0);
        System.out.println("Вы ввели: "  + userNum + " Попыток: " + counter + " Спасибо! ");
    }
}
