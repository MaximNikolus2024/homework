package lesson15.klasswork;

public class Main02 {

    public static int sun(int[] array){

       return sum(array, 0, array.length);
    }

    public static int sum(int[]array,int from,int to){
        int sum =0;
        for (int i = from; i < to; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
