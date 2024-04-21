package lesson18.klasswork;

public class Dog {
    String name;
    int weight;

    public Dog(String name,int weight){
        this.name = name;
        this.weight = weight;


    } String whoAmI(){
        return "I am dog " + this.name + ", my weight: " +  this.weight ;

    }
    void eat(){
        System.out.println("Я ем");
        weight++;
    }

    void run(){
        System.out.println("Я бегу");
        weight -=2;

        while (weight < 3){
            System.out.println("Прости! Я слишом худой и голодный, бежать не могу!");
            System.out.println("Надо поесть! Мой вес сейчас: " + weight);
            eat();
        }
    }
}
