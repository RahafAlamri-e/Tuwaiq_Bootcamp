package week03.day02;

public class PartTime extends Constructor{
    private int hours;
    private int total;

    public PartTime(){

    }

    public PartTime(String firstName, String lastName, String phone, String email, int age, int salary, String position, int hours){
        super(firstName,lastName,phone,email,age,salary,position);
        this.hours = hours;
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(hours * 50);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

}
