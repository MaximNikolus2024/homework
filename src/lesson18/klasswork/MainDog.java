package lesson18.klasswork;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Mars",5);

        String info = dog.whoAmI();
        System.out.println(info);

        dog.run();
        dog.run();
        dog.run();

        System.out.println(dog.whoAmI());


    }
}
