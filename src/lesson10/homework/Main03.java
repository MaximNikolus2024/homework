package lesson10.homework;

import java.util.Random;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your question:");
        String[] answers = {
                "Да",
                "Нет",
                "Весьма вероятно",
                "Не рассчитывай на это.",
                "Не могу предсказать.",
                "Да, но будь осторожен.",
                "По всей видимости.",
                "Знаки указывают на 'да'.",
                "Знаки указывают на 'нет'."
        };
        String question = scanner.nextLine();
        Random random = new Random();
        int index = random.nextInt(answers.length);
        String answer = answers[index];
        System.out.println(answer);



    }
}
