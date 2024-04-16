package consulteishon04;

import java.util.Random;

public class Main05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[40];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }


    }
}
