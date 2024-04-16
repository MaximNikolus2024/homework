package lesson13.homework;

import java.util.Scanner;

public class Main03 {

    public static int readNumber (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static float heightToMeter(float height){
        return height /100f;
    }

    public static float bmi(float height, float weight){
        return (float) (weight / Math.pow(height,2));
    }

public static void results(float res){
        Scanner scanner = new Scanner(System.in);
    System.out.println("ИМТ:" + res + ", У вас: ");
    if (res < 15) {
        System.out.println("Анорексия");
    } else if (res < 20) {
        System.out.println("Недостаточный вес");
    } else if (res < 25) {
        System.out.println("Нормальный вес");
    } else if (res < 30) {
        System.out.println("Лишний вес");
    } else {
        System.out.println("Ожирение");
    }
}

    public static void main(String[] args) {
     int weight = readNumber("Введите вес в кг:");
     float height = heightToMeter(readNumber("Введите рост в см:"));
     float bmi = bmi(height, weight);
     results(bmi);

    }
}
