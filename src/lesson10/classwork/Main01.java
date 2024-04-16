package lesson10.classwork;

import java.util.Random;

public class Main01 {
    public static void main(String[] args) {
        Random random = new Random(5);
        int number = random.nextInt();
        System.out.println(number);
    }
}
