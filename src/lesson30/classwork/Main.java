package lesson30.classwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {-1,3,14,52,7,88};
        List<Integer> list = new ArrayList<>();
       for (int i : array){
           list.add(i);
       }
       list.add(9);
        System.out.println(list);
    }
}
