package lesson26.classwork.example02;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("Hello");
        linkedList.add("world");
        linkedList.add("Programing");
        linkedList.add("Java",2);
        linkedList.remove(1);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
            
        }
    }
}
