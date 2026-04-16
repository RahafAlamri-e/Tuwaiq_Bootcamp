package week03.Lab4;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle() {
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public double calculateCircumference() {
        return 3 * base;
    }
}
