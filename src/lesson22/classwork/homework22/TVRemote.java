package lesson22.classwork.homework22;

public class TVRemote {
    private double frequency = 105.2;

    public TVRemote(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void chanelForward(TV tv) {
        if (frequency == tv.getFrequency()) {
            tv.chanelForward();
        }
    }
    public void channelBackward(TV tv){
        if (frequency == tv.getFrequency()){
         tv.channelBackward();
        }
    }
    public void switchChanel(TV tv, int channelNumber){
        if (frequency == tv.getFrequency()){
            tv.setCurrentChanel(channelNumber);
        }
    }
}




