package week03.tasks;

public class Main {
    public static void main(String[] args) {
        HonorsStudent hs1 = new HonorsStudent("101","nora","noura@gmail.com","059382881",20,90,5);
        RegularStudent rs1 = new RegularStudent("102","hessa","hessa@gmail.come","049y927464",19 ,80,70);

        double gradehs= hs1.calculateGrade();
        double graders= rs1.calculateGrade();
        System.out.println(gradehs);
        System.out.println(graders);
    }
}
