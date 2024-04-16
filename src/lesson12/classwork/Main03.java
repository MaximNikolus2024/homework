package lesson12.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 10;
        int number = min + random.nextInt(max - min + 1);
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        System.out.println("Guess the number between 1 and 10");
        while (true){
            int guess = scanner.nextInt();
            attempts++;

            if (guess == number){
                System.out.println("This is correct!");
                System.out.println("Attempts: " + attempts);
                break;
            } else if (guess > number) {
                System.out.println(" To large number! try again:");
            }else {
                System.out.println(" To small number! try again:");
            }
        }
    }
}
