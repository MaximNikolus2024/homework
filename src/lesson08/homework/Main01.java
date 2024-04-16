package lesson08.homework;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int userNum = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < userNum;i+=2){
            sum += i;
    }
        System.out.println("Sum:" + sum);
    }
}
