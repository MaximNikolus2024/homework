package lesson29.classwork.homework;

import java.util.Objects;

public class Kettlebell implements Comparable<Kettlebell> {
    private Materials material;
    private Colors color;
    private double weight;

    public Kettlebell(Materials material, Colors color, double weight) {
        this.material = material;
        this.color = color;
        this.weight = weight;
    }

    public Materials getMaterial() {
        return material;
    }

    public void setMaterial(Materials material) {
        this.material = material;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Kettlebell o) {
        if (this.weight > o.weight) {
            return 1;
        } else if (this.weight < o.weight) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "material " + this.material
                + ",  color " + this.color
                + ", weight " + this.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, color, weight);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o instanceof Kettlebell) {
            Kettlebell p = (Kettlebell) o;

            return p.material.equals(this.material)
                    && p.color == this.color
                    && p.weight == this.weight;
        }
        return false;
    }
}

