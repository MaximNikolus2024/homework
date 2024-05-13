package lesson25.homework;

public class Circle extends Shape {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.pow(r,2);
    }
}
