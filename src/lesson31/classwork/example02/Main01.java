package lesson31.classwork.example02;

public class Main01 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.hashCode() % 4);
        String s2 = "java";
        System.out.println(s2.hashCode() % 4);
    }

}
