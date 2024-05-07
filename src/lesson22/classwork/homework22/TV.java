package lesson22.classwork.homework22;

public class TV {
    private  double frequency = 105.2;
    private int currentChanel;
    TVRemote tvRemote;

    public TV(double frequency) {
        this.frequency = frequency;
        currentChanel = 1;
    }

    public double getFrequency() {
        return frequency;
    }


    public int getCurrentChanel() {
        return currentChanel;
    }
    public void chanelForward(){
        currentChanel ++;
    }
    public void channelBackward(){
        if (currentChanel > 1){
            currentChanel --;
        }
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel > 0)
        this.currentChanel = currentChanel;
    }
}
