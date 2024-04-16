package lesson06.homework06;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вес и рост:");
            float weight = scanner.nextFloat();
            float height = scanner.nextFloat() /100f;
            float res = weight / ( height * height);

            if (res  <15) {
                System.out.println("Анорексия");
          } else if (res <20) {
                System.out.println("Недостаточный вес");
            }else if (res < 25){
                System.out.println("Нормальный вес");
            }else if (res <30){
                System.out.println("Лишний вес");
            }else {
                System.out.println("Ожирение");
            }
    }
}
