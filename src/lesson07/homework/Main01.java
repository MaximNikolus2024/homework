package lesson07.homework;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int moth = scanner.nextInt();
        String answer = "";

        switch (moth) {
            case 1:
                answer = "Январь";
                break;
            case 2:
                answer = "Февраль";
                break;
            case 3:
                answer = "Март";
                break;
            case 4:
                answer = "Апрель";
                break;
            case 5:
                answer = "Май";
                break;
            case 6:
                answer = "Июнь";
                break;
            case 7:
                answer = "Июль";
                break;
            case 8:
                answer = "Август";
                break;
            case 9:
                answer = "Сентябрь";
                break;
            case 10:
                answer = "Октябрь";
                break;
            case 11:
                answer = "Ноябрь";
                break;
            case 12:
                answer = "Декабрь";
                break;
        }
        System.out.println(answer);
    }
}
