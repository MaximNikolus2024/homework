package lesson25.classwork.example01;

public class Fish extends Pet implements Petable{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("Вы кормите рыбку в аквариуме");
    }

    @Override
    public void cleanUp() {
        System.out.println("Смените воду рыбе");
    }

    @Override
    public void pet() {
        System.out.println("Ваш питомец рыба");
    }
}
