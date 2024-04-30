package lesson19.homework;

import java.util.Scanner;

public class Pen {
    private int inkAmount = 100;

    public int getInkAmount() {
        return inkAmount;
    }
    public void Write(String text){
        for (int i = 0; i < text.length(); i++){
            if (inkAmount == 0){
                break;
            }
            System.out.print(text.charAt(i));
            inkAmount--;
        }
        System.out.println();
    }
    public void refill(){
        inkAmount = 100;
    }
    public void checkInk(){
        System.out.println("Remaining ink " + inkAmount);
    }
}
