package lesson20.classwork.example2;

public enum TrafficLightColor {
    RED("Red", false),
   YELLOW("yellow", false),
   GREEN("Green", true);
    private String colorName;
    private boolean canGo;
    private TrafficLightColor(String colorName, boolean canGo) {
        this.colorName = colorName;
        this.canGo = canGo;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public boolean isCanGo() {
        return canGo;
    }

    public void setCanGo(boolean canGo) {
        this.canGo = canGo;
    }
}
