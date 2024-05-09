package lesson18.homework;

import java.util.Objects;

public class Student {
    Object o = new Object();
    private String name;
    private int yearOfEducation;
    private int age;

    public Student(String name, int yearOfEducation, int age) {
        this.name = name;
        this.yearOfEducation = yearOfEducation;
        this.age = age;
    }

    public int getYearOfEducation() {
        return yearOfEducation;
    }

    public void setYearOfEducation(int yearOfEducation) {
        this.yearOfEducation = yearOfEducation;
    }
    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
public void setAge(int age){
        if (age >= 0){
            this.age = age;
        }
}

    public void sleep() {
        System.out.println("Я сплю");
        System.out.println("Дай ещё 5 минут.");
    }

    public void run() {
        System.out.println("Ё моё, опаздываю!");
    }
    @Override
    public String toString(){
        return "name: " + this.name
                + " yearOfEducation: " + this.yearOfEducation
                + ", age: " + this.age;


    }
@Override
    public int hashCode(){
        return Objects.hash(name,yearOfEducation,age);
}
@Override
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        if (o instanceof Student){
            Student student = (Student) o;
            return student.name.equals(this.name)
                    && student.yearOfEducation == this.yearOfEducation
                    && student.age == this.age;

    }
        return false;
}


}





