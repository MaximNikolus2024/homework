package lesson23.classwork.example01;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Aramis", 3,"Chau-chau", 2,20,DogProfession.DOMESTIC);
        Cat cat = new Cat("Bayun",4,"Manul", 3, true);
        dog.bark();
        cat.meow();
    }
}
