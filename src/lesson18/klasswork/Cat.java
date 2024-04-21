package lesson18.klasswork;

public class Cat {
    String name;
    String color;
    int age;
    public Cat(){

    }
    public Cat(String catName){
        name = catName;
    }

    public Cat(String catName,String color){
        name = catName;
       this.color = color;
    }
    public Cat(String name , String color , int age){
        this(name,color);
        this.age = age;
    }

    public void sleep(){
        System.out.println("Я сплю");
    }

    public void run(){
        System.out.println("Я бегу");
    }

    public void sayMau(){
        System.out.println("Мяу");
    }

    public void whoAm(){
        System.out.println("Имя " + name + " Цвет " + color +" Возраст " + age);
    }


}
