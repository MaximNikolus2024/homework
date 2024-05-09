package lesson25.classwork.example01;

public class Cat extends Pet implements Voiceable,Petable{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void feed() {
        System.out.println("You put cat food in plate");
    }

    @Override
    public void cleanUp() {
        System.out.println("You clean litter box");
    }
    @Override
    public void pet() {

    }

    @Override
    public void voice() {

    }
}
