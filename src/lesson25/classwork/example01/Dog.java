package lesson25.classwork.example01;

public class Dog extends Pet implements Voiceable,Petable,Walkable{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Вы кормите собаку");
    }

    @Override
    public void cleanUp() {
        System.out.println("Мешок заполнен, сэр!");
    }

    @Override
    public void voice(){
        System.out.println("bark!");
    }

    @Override
    public void pet() {
        System.out.println("Ваш питомец собака:)");
    }

    @Override
    public void goToWalk() {
        System.out.println("Время погулять");
    }
}
