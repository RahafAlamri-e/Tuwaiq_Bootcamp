package week03.day02;

public class Constructor extends Person{
    private int Salary;
    private String position;

    public Constructor() {
    }


    public Constructor(String firstName, String lastName, String phone, String email, int age, int salary, String position) {
        super(firstName, lastName, phone, email, age);
        this.Salary = salary;
        this.position = position;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "Salary=" + Salary +
                ", position='" + position + '\'' +
                '}';
    }
}
