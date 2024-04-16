package lesson10.homework;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter value of array");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            array[i] *= 2;
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
