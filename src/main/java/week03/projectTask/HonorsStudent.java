package week03.projectTask;

public class HonorsStudent extends Student {
    private double bonusMarks;



    public HonorsStudent(String id, String name, String email, String phone, int age, double totalmarks, double bonusMarks) {
        super(id, name, email, phone, age, totalmarks);
        this.bonusMarks = bonusMarks;
    }

    @Override
    public double calculateGrade() {
        return super.getTotalmarks()+ bonusMarks;
    }

    @Override
    public String toString() {
        return super.toString()+"HonorsStudent{" +
                "bonusMarks=" + bonusMarks +
                '}';
    }
}
