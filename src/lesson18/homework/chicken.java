package lesson18.homework;

public class chicken {
    String name;
    int weight;
    public chicken(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    String whoAmI(){
       return "Курица " + this.weight + " , Вес " + this.weight;
    }
    void eat(){
        System.out.println("ням-ням");
        weight++;
    }
}
