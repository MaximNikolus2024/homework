package lesson06.classwork06;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();

        if ((int)num == num){
            System.out.println("Whole");
        } else{
            System.out.println("Fractional");
        }
    }
}
