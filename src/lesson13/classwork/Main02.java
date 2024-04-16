package lesson13.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static  int rollDice(){
        return Main04.getRandomNumber(1,6);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int roll = rollDice();
            System.out.println("Dice rolled: " + roll);
            input = scanner.next();
        }while (!input.equals("0"));
    }
}
