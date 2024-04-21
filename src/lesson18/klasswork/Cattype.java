package lesson18.klasswork;

public class Cattype {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.sayMau();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя: " + catName);
        System.out.println("Цвет " +cat.color);
        System.out.println("Age " + cat.age);
        System.out.println("\n###############\n");

        Cat cat1 =new Cat("Mars");
        Cat cat2 = new Cat("Mars","Blu");

        Cat cat3 = new Cat("lon","Black", 5);
        cat3.whoAm();
    }
}
