package lesson12.classwork;

import java.util.Scanner;

public class Man04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 2; i < input / 2; i++){
            if (input % i == 0){
                System.out.println("Number is not prime");
                break;

            }
        }
        System.out.println("Number is  prime");
    }
}
