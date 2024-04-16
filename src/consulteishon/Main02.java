package consulteishon;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int sale = scanner.nextInt();

        double finalPrice = price - (price * sale /100.0);
        System.out.println(finalPrice);

    }
}
