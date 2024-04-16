package consulteishon;

import java.util.Scanner;

public class Man01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matchMark = scanner.nextInt();
        int programmingMark = scanner.nextInt();
        int phisicsMark = scanner.nextInt();

        double avg = ( matchMark +programmingMark + phisicsMark ) /3.0;
        System.out.println(avg);
    }
}
