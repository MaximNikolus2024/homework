package lesson19.klasswork.example1;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Maxim", 19);
        Human anton = new Human("Anton",30);
        Human.celebrateBirthday(maxim);
      Human.meet(maxim,anton);

    }
}
