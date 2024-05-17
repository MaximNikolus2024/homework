package lesson29.classwork.example03;

import java.util.Iterator;

public class MyArrayList <T> implements Iterable <T> {
    private Object[] array;
   private int size;

   public MyArrayList(int initialSize){
       size = initialSize;
       array = new Object[size];

   }
    public MyArrayList(){
        this(0);

    }
    public int getSize() {
        return size;
    }

    public T get(int index){
       return (T) array[index];
    }
public void set(int index, T val){
       array[index] = val;
}
public int indexOf(T value){
       for(int i = 0; i< size; i++){
           if (array[i].equals(value)){
               return i;
           }
       }
       return -1;
}

public boolean contains(T value){
       return indexOf(value) !=-1;
}
public void reSize(int newSize){
       Object[] temp = new Object[newSize];
       int minSize = Math.min(size, newSize);
       for (int i = 0; i < size; i++){
           temp[i] = array[i];
       }
       array = temp;
       size = newSize;
}
public void  add(T value){
       if (size + 1 > array.length){
           reSize(size +1);
           array[size -1] = value;
       }else {
           array[size] = value;
           size++;
       }

}
public void remove (int index){
       for (int i = index; i < size; i++){
           array[i] = array[i +1];
       }
       size--;
}

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(array);
    }

    public class MyIterator <T> implements Iterator <T>{
     private Object[] array;


     private int current;


     public MyIterator(Object[] array){
         this.array = array;
         current = 0;
     }
        @Override
        public boolean hasNext() {
            return current < array.length;
        }

        @Override
        public T next(){
           return (T)array[current++];
       }
    }
}
