package lesson24.classwork.example02;

public class Main {
    public static void voice(Pet pet){
     if (pet instanceof Cat){
         Cat cat = (Cat)pet;
         cat.meow();
     }
     if (pet instanceof Dog){
         Dog dog = (Dog) pet;
         dog.bark();
     }
    }
    public static void main(String[] args) {

        Pet pet1 = new Dog("Richard", 6, "Golden retriever", 15, 50, DogProfession.DOMESTIC);
        Pet pet2 = new Cat("Vasya", 4, "Sphinks", 1.5, false);

        voice(pet1);
       voice( pet2);
    }
}
