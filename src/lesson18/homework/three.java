package lesson18.homework;

public class three {
    String name;
    int grow;
    public three(String name , int grow){
        this.name = name;
        this.grow = grow;
    }

    String whoAmI(){
      return   "дерево " + this.name + " Вооот Такой вышины " + this.grow;
    }
    public void grow(){
        System.out.println("Стою расту");
        grow++;
    }
}
