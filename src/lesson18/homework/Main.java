package lesson18.homework;

public class Main {
    public static void main(String[] args) {
Student student = new Student("Maxim", 3, 20);
Student student2 = new Student("Maxim", 3, 20);
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student.equals(student2));

    }
}
