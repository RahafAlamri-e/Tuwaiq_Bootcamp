package week03.day02;

public class FullTime extends Constructor{
    private int bonus;

    public FullTime(){

    }

    public FullTime(String firstName, String lastName, String phone, String email, int age, int salary, String position, int bonus){
        super(firstName,lastName,phone,email,age,salary,position);
        this.bonus = bonus;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

    public int getBonus(){
        return bonus;
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary + bonus);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }


}
