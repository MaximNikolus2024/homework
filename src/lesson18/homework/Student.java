package lesson18.homework;

public class Student {
    private String name;
    private int yearOfEducation;
    private int age;
    private int knowledge;

    public Student(String name, int yearOfEducation, int age) {
        this.name = name;
        this.yearOfEducation = yearOfEducation;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Я сплю");
        System.out.println("Дай ещё 5 минут.");
    }

    public void run() {
        System.out.println("Ё моё, опаздываю!");
    }

    public void study() {
        System.out.println("лишь бы на отлично.");
        knowledge++;
    }

}

