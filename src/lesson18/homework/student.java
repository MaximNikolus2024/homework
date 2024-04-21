package lesson18.homework;

public class student {
    String name;
    int yearOfEducation;
    int age;
    int knowledge;
    public student(String name, int yearOfEducation, int age) {
        this.name = name;
        this.yearOfEducation = yearOfEducation;
        this.age = age;
    }
public void sleep(){
    System.out.println("Я сплю");
    System.out.println("Дай ещё 5 минут.");
}

public void run(){
    System.out.println("Ё моё, опаздываю!");
}
public void study (){
    System.out.println("лишь бы на отлично.");
    knowledge++;
}
public void whoAreYouStudent(){
    System.out.println("Имя " + name + " Возраст " + age + " Курс " +  yearOfEducation);
}
}
