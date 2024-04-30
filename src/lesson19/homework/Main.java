package lesson19.homework;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        for (int i = 0;i < 20; i++){
            pen.Write("Hello World");
            pen.checkInk();
            if (pen.getInkAmount() <= 0) {
                pen.refill();
                System.out.println("(refilled the pen)");
            }
        }

    }
}
