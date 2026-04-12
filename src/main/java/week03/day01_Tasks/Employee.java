package week03.day01_Tasks;

public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(){

    }

    public Employee(String id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raisedSalary(int percent){
        salary += salary * percent / 100;
        return salary;
    }

    public String toString(){
        return "Employee details: "
                + "\n id = " + id
                + "\n name = " + name
                + "\n salary = " + salary;
    }
}
