package lesson04.homework04;
import java.util.Scanner;
public class Main01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму фактической прибыли : ");
            float geld = scanner.nextInt();

            float nalogPensii = geld * 0.03f;
            System.out.println(" Сумма налога в пенсионный фонд составляет: (3%) " + nalogPensii + "€");

            float rabochiyNalog = geld * 0.15f;
            System.out.println(" Сумма налога на заработок составляет: (15%) " + rabochiyNalog + "€");

            float res = geld - nalogPensii - rabochiyNalog;
            System.out.println(" Чистая прибыль составляет: " + res + "€");
        }
}
