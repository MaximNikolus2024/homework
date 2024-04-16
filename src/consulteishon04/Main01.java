package consulteishon04;

public class Main01 {
    public static void main(String[] args) {
        int[]array = {-7, -5, 12, -3, 8};

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i ++){
            array[i] *= array[i] < 0 ? 3 : 5;
        }

        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


        for (int i = 0; i < array.length; i++){
            array[i] *= -1;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
