package lesson15.klasswork;

import java.util.Scanner;

public class Main01 {
    public static String getDayOWeekName(int n) {
        switch (n) {
            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";

            case 4:
                return "Thursday";

            case 5:
                return "Friday";

            case 6:
                return "Saturday";

            case 7:
                return "Sunday";

        }
        return "";
    }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            String dayOfWeek = getDayOWeekName(n);

            System.out.println();
        }

    }
