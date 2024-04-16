package lesson08.classwork;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = 1;
        for (int i = 1; i<=num;i++){
            res = res * i;

        }
        System.out.println(res);
    }
}
