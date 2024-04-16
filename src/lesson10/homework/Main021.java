package lesson10.homework;

import java.util.Random;

public class Main021 {
    public static void main(String[] args) {
        Random ran = new Random();
        int min = 1;
        int max = 100;
        int[] array = new int[10];

        for (int i = 1; i < array.length; i++){
            array[i] = min + ran.nextInt(max - min + 1);
        }
        for (int i = 1; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] reversedArray = new int[array.length];
        for (int i = 1; i < reversedArray.length; i++){
            reversedArray[i] = array[reversedArray.length  - i - 1];
        }
        for (int i = 1; i < reversedArray.length; i++){
            System.out.print(reversedArray[i] + " ");
        }

    }
}
