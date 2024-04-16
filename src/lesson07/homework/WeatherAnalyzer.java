package lesson07.homework;

//Как часто вы думвли "Чтобы мне надеть ?" а смотря в окно вы не могли решить
// шорты,пальто,куртка и тд.
// и в последствии оставались дома?
// Чтож, Позвольте мне представить мою программу!
//WeatherAnalyser избавит вас от проблем выбора одежды.
//Введите температуру за окном и получите наши рекомендации.

import java.util.Scanner;

public class WeatherAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        String answer = "";
        if (temp <=0){
          answer =  "Холодрыга: Сидите дома пейте чай";
        } else if (temp >=10 && temp <30) {
          answer = "Обычная температура: взависимости от времени года, одентесь по вкусу";
        }else {
         answer = "Куда собрались? сидите дома! службы доставки в помощь";
        }
        System.out.println(answer);
    }
}
