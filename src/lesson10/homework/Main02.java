package lesson10.homework;

import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j <= i; j++) {
                array[i] = random.nextInt(100);
                System.out.print(array[i]);
            }
            System.out.println();
        }
        for (int i = array.length - 1; i > 0; i--){
            for (int j = 1;j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

