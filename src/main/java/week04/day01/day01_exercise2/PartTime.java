package week04.day01.day01_exercise2;

public class PartTime extends Employee {
    private int hours;

    public PartTime() {
    }

    public PartTime(String name, double salary, int hours) {
        super(name, salary);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double totalSalary() {
        return getSalary() + (hours*200);
    }
}
