package week03.day02;

public class Student extends Person{
    private double gpa;

    public Student(){
    }

    public Student(String firstName, String lastName, String phone, String email, int age, double gpa){
        super(firstName,lastName,phone,email,age);
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

}
