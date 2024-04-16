package lesson13.classwork;
public class Main01 {

     public static void printTenNumber(){
         for (int i = 0; i <= 20; i++){
             System.out.print(i + " ");
         }
     }
    public static void main(String[] args) {
        System.out.println("Print 10 numbers");
        printTenNumber();
        System.out.println();
        System.out.println("Print 10 numbers agan");
        printTenNumber();
    }
}
