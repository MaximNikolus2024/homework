package lesson29.classwork.example02;

public class Main {
    public static void main(String[] args) {
        Bottle bottle1 =new Bottle(Material.PLASTIC,10);
        Bottle bottle2 = new Bottle(Material.STEEL,1.5);
        int res = bottle1.compareTo(bottle2);
        if (res > 0){
            System.out.println("First bottle is Stronger");
        } else if (res < 0) {
            System.out.println("Second bottle is Stronger");
        }else{
            System.out.println("Bottles are equal");
        }
    }

}
