package lesson29.classwork.example02;

public class Bottle implements Comparable<Bottle> {
    private Material material;
    private double liters;

    public Bottle(Material material, double liters) {
        this.material = material;
        this.liters = liters;
    }

    public Material getMaterial() {
        return material;
    }

    public double getLiters() {
        return liters;
    }

    @Override
    public int compareTo(Bottle o) {
        if (this.liters > o.liters) {
            return 1;
        } else if (this.liters < o.liters) {
            return -1;

        }
        return 0;
    }
}



