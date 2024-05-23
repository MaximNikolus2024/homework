package lesson30.classwork;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<String> fruts = new ArrayList<>();
        fruts.add("Apple");
        fruts.add("Grapes");
        fruts.add("Orange");
        fruts.add("Melon");
        fruts.add("Pear");
        System.out.println(fruts);
        fruts.remove("Melon");
        System.out.println(fruts);
    }

}
