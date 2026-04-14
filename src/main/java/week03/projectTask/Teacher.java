package week03.projectTask;

public class Teacher extends Person{
    private int salary;
    private String position;
    private int bonus;

    public Teacher() {

    }

    public Teacher(String id, String name, String email, String phone, int age, int salary, String position, int bonus) {
        super(id, name, email, phone, age);
        this.salary = salary;
        this.position = position;
        this.bonus = bonus;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int getBonus() {
        return bonus;
    }
}
