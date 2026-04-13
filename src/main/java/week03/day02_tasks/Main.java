package week03.day02_tasks;

public class Main {
    public static void main(String[] args) {

        Shape sh = new Shape();
        System.out.println(sh);

        Circle c = new Circle(5, "red", true);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());

        Rectangle r = new Rectangle(4, 6, "blue", false);
        System.out.println(r);
        System.out.println("Perimeter: " + r.getPerimeter());

        Square sq = new Square(3, "yellow", true);
        System.out.println(sq);
        System.out.println("Area: " + sq.getArea());
    }
}
