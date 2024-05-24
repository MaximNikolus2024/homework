package lesson31.classwork;

import java.util.LinkedList;
import java.util.Queue;

public class Main01 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Banana");
        queue.offer("Apple");
        queue.offer("Cherry");
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek: " + queue.peek() );
        queue.offer("Pear");
        for (String s : queue) {
            System.out.println(s);

        }
        System.out.println("Queue is empty: " +
                queue.isEmpty());
        queue.peek();
    }
}
