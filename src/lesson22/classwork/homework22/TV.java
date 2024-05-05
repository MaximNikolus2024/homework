package lesson22.classwork.homework22;

public class TV {
    private  double frequency = 105.2;
    private int currentChanel;
    TVRemote tvRemote;

    public TV(double frequency, int currentChanel) {
        this.frequency = frequency;
        this.currentChanel = currentChanel;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
    }
}
