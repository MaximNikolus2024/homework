package lesson25.homework;

public class Rectangle extends Shape {
    private double l;
    private double h;

    public Rectangle(double l, double h) {
        this.l = l;
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return l * h;
    }
}
