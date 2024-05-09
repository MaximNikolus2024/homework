package lesson18.homework;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("alexey", 5, 21);
        Student student2 = new Student("alexey", 5, 21);
        student.sleep();
        student.run();
        student.study();
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println(student.equals(student2));

    }
}
