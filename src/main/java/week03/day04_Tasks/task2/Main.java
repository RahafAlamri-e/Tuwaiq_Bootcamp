package week03.day04_Tasks.task2;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(10, 8, 5, 4);

        System.out.println("Point before any change: " + point);

        point.moveUp();
        System.out.println("\nAfter moveUp: " + point);

        point.moveDown();
        System.out.println("\nAfter moveDown: " + point);

        point.moveLeft();
        System.out.println("\nAfter moveLeft: " + point);

        point.moveRight();
        System.out.println("\nAfter moveRight: " + point);
    }
}
