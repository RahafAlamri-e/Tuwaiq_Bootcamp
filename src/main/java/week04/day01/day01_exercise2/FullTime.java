package week04.day01.day01_exercise2;

public class FullTime extends Employee {
    private int bonus;


    @Override
    public double totalSalary() {
        return getSalary() + bonus;
    }

    public FullTime() {
    }

    public FullTime(String name, double salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
