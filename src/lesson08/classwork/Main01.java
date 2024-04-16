package lesson08.classwork;

public class Main01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int result;
        int counter = 0;

        while (counter < 3){
            x = x+5;
            y= y+10;
            result = x * y;
            System.out.println(" Результат умножения" +result);
            counter++;
        }
        System.out.println("Программа завершена");
    }
}
