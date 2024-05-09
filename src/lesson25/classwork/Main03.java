package lesson25.classwork;

public class Main03 {
    public static void main(String[] args) {
        String text = "Hello world!";
       text = text.toUpperCase();
        System.out.println(text);
        System.out.println("*".repeat(text.length()));
     text =text.replace("L","!");
        System.out.println(text);

    }
}
