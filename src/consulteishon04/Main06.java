package consulteishon04;

public class Main06 {
    public static void main(String[] args) {
        int[]array = {-7, -5, 12, -3, 8};
        int[]array1 = array;

        for (int i =0; i < array1.length; i++){
            System.out.println(array[i] + " ");
        }
        array[1] = 100;
        System.out.println();
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i] + " ");
        }
    }
}
