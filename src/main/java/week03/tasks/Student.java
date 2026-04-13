package week03.tasks;

public class Student extends Person {
    private double totalmarks;

    public Student(String id, String name, String email, String phone, int age, double totalmarks) {
        super(id, name, email, phone, age);
        this.totalmarks = totalmarks;
    }


    public void setTotalmarks(double totalmarks) {

        this.totalmarks = totalmarks;
    }

    public double getTotalmarks() {
        return totalmarks;
    }

    public double calculateGrade() {
        return totalmarks;
    }

    @Override
    public String toString() {
        return super.toString()+ " Studentt{" +
                "totalmarks=" + totalmarks +
                '}';
    }
}
