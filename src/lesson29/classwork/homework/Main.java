package lesson29.classwork.homework;

public class Main {
    public static void main(String[] args) {
        Kettlebell kettlebell1 = new Kettlebell(Materials.STEEL,Colors.BLACK,10);
        Kettlebell kettlebell2 = new Kettlebell(Materials.STEEL,Colors.BLACK, 25);
        int res = kettlebell1.compareTo(kettlebell2);
        if (res > 0) {
            System.out.println("First bottle is bigger");
        } else if (res < 0) {
            System.out.println("Second bottle is bigger");
        } else {
            System.out.println("Bottles are equal");
        }
    }
}
