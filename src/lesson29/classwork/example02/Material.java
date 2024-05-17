package lesson29.classwork.example02;

public enum Material {
    GLASS(0),
    PLASTIC(1),
    ALUMINIUM(2),
    STEEL(3);
    private final int strength;
    Material(int strength){
        this.strength = strength;
    }
public int getStrength(){
        return strength;
}
}

