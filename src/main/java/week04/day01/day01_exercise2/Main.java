package week04.day01.day01_exercise2;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTime("ali",7000,2000);
        Employee e2 = new PartTime("omer",3000, 20);
        System.out.println("full time employee total salary: " + e1.totalSalary());
        System.out.println("part time employee total salary: " + e2.totalSalary());

    }
}
