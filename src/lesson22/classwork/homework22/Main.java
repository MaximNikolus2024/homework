package lesson22.classwork.homework22;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(10);
        TVRemote tvRemote = new TVRemote(10);
        tvRemote.chanelForward(tv);
        System.out.println("Current channel " + tv.getCurrentChanel());
        tvRemote.switchChanel(tv,11);
        System.out.println("Current channel: " + tv.getCurrentChanel());
    }
}
