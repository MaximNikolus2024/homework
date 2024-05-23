package lesson30.classwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main05 {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        List<Character> list = new ArrayList<>();
        for (char ch : a) {
            if (!b.contains(ch)) {
                list.add(ch);
            }
        }
        for (char ch : b) {
            if (!a.contains(ch)) {
                list.add(ch);
            }
        }


        return list;
    }


    public static int[] removeSmallest(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i : numbers){
            list.add(i);
        }
        Integer min = Integer.MIN_VALUE;
        for (int i : list){
            if (min > i){
                min = i;
            }
        }
        list.remove(min);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
        res[i] = list.get(i);
        }
        return null;
    }
}
