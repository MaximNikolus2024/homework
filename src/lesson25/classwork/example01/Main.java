package lesson25.classwork.example01;

public class Main {
    public static void main(String[] args) {
        Dog pet1 = new Dog("Richard", 4);
        Cat pet2 = new Cat("Vasya", 3);
        pet1.voice();
        pet2.voice();
        pet1.pet();
        pet1.feed();
        pet1.cleanUp();
        pet1.goToWalk();
    }
}
