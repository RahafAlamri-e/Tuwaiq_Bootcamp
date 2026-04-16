package week03.Lab4;

public class Main {
    public static void main(String[] args) {

        // Circle
        Circle c = new Circle(5.0);
        System.out.println("Circle");
        System.out.println("Radius: " + c.getRadius());
        System.out.printf("Area: %.2f%n",  c.calculateArea());
        System.out.printf("Circumference: %.2f%n", c.calculateCircumference());

        c.setRadius(7.0);
        System.out.println("\nCircle after updating radius");
        System.out.println("Radius: " + c.getRadius());
        System.out.printf("Area: %.2f%n",  c.calculateArea());
        System.out.printf("Circumference: %.2f%n", c.calculateCircumference());

        // Rectangle
        Rectangle r = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle");
        System.out.println("Height: " + r.getHeight());
        System.out.println("Width: " + r.getWidth());
        System.out.printf("Area: %.2f%n", r.calculateArea());
        System.out.printf("Circumference: %.2f%n", r.calculateCircumference());

        r.setHeight(8.0);
        r.setWidth(10.0);
        System.out.println("\nRectangle after updating height and width");
        System.out.println("Height: " + r.getHeight());
        System.out.println("Width: " + r.getWidth());
        System.out.printf("Area: %.2f%n", r.calculateArea());
        System.out.printf("Circumference: %.2f%n", r.calculateCircumference());


        // Tringle
        Triangle t = new Triangle(4.0, 6.0);
        System.out.println("\nTriangle");
        System.out.println("Height: " + t.getHeight());
        System.out.println("Base: " + t.getBase());
        System.out.printf("Area: %.2f%n", t.calculateArea());
        System.out.printf("Circumference: %.2f%n", t.calculateCircumference());

        t.setHeight(5.0);
        t.setBase(9.0);
        System.out.println("\nTriangle after updating height and base");
        System.out.println("Height: " + t.getHeight());
        System.out.println("Base: " + t.getBase());
        System.out.printf("Area: %.2f%n", t.calculateArea());
        System.out.printf("Circumference: %.2f%n", t.calculateCircumference());
    }
}
