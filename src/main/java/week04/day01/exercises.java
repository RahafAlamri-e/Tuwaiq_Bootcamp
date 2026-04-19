package week04.day01;

public class exercises {

    public static void main(String[] args) {
        System.out.println("4 * 5 = ");
        milty(4,5);

        System.out.println("4 * 5 * 4 = ");
        milty(4,5,4);

        System.out.println("4.5 * 5.5 = ");
        milty(4.5,5.5);

    }

    public static void milty(int a, int b){
        System.out.println(a*b);
    }

    public static void milty(int a, int b, int c){
        System.out.println(a*b*c);
    }

    public static void milty(double a, double b){
        System.out.println(a*b);
    }
}
