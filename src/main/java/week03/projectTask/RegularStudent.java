package week03.projectTask;

public class RegularStudent extends Student {

    private double attendPercentage;

    public RegularStudent(String id, String name, String email, String phone, int age, double totalmarks, double attendPercentage) {
        super(id, name, email, phone, age, totalmarks);
        this.attendPercentage = attendPercentage;
    }

    public void setAttendPercentage(double attendPercentage){
        this.attendPercentage = attendPercentage;
    }

    public double getAttendPercentage(){
        return attendPercentage;
    }

    @Override
    public double calculateGrade(){
        if(attendPercentage < 75){
            return getTotalmarks() - 10 ;
        }
        else
            return getTotalmarks();

    }

    @Override
    public String toString() {
        return super.toString()+"RegularStudent{" +
                "attendPercentage=" + attendPercentage +
                '}';
    }
}
