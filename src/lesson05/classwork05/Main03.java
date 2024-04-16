package lesson05.classwork05;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();

        if (number >0) {
            System.out.println(" Number ist positive");
        } else if ( number==0 )
        {
            System.out.println("Number ist zero");
        } else {
            System.out.println("Number ist negative");
        }
    }
}
