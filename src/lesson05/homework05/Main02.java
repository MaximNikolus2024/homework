package lesson05.homework05;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scanner.nextInt();

        if (age < 13){
            System.out.println("You are child");

        } else if (age >= 13 && age <= 18) {
            System.out.println("You are teenager");

        }else if (age >=18&& age < 60){
            System.out.println("You are adult");
        } else if (age >=60) {
            System.out.println("You are old");

        }

    }
    }



