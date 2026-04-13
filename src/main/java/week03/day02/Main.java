package week03.day02;

public class Main {
    public static void main(String[] args) {

        FullTime full1 = new FullTime("amal","saleh","052849248","amalSaleh@gmail.com",34,10000,"teacher",5000);
        PartTime part1 = new PartTime("rand","omer", "050390222","randOmer@hmail.com",43, 4000, "teacher",30);

        full1.setSalary(10000);
        part1.setSalary(0);

        System.out.println("Full time salary " + full1.getSalary());
        System.out.println("Part time salary " + part1.getSalary());

    }

}
