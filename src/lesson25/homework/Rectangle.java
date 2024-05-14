package lesson25.homework;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double h) {
        this.length = l;
        this.width = h;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
