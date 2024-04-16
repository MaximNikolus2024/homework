package lesson05.homework05;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly income");
        int income = scanner.nextInt();

        float socialTax = income * 0.03f;
        float incomeTax = income * 0.22f;
        float incomeTax1 = income * 0.18f;
        float incomeTax2 = income * 0.13f;
        if (income > 20000) {
            System.out.println("Pension found tax: " + socialTax);
            System.out.println("Income tax: " + incomeTax);
            System.out.println("Your total profit:" + (income - incomeTax - socialTax));
        } else if (income > 10000 && income < 20000) {
            System.out.println("Your pension fund tax: " + socialTax);
            System.out.println("Income tax: " + incomeTax1);
            System.out.println("Your total profit:" + (income - incomeTax1 - socialTax));
        } else if (income < 10000) {
            System.out.println("Your pension fund tax: " + socialTax);
            System.out.println("Income tax: " + incomeTax2);
            System.out.println("Your total profit:" + (income - incomeTax2 - socialTax));

        }
    }
        }