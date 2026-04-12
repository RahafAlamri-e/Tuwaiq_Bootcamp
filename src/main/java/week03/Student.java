package week03;

public class Student {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private int age;
    private double gpa;

    public Student(){

    }

    public Student(String firstName, String lastName, String phone, String email, int age, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.gpa = gpa;
    }

    public String setFirstName (String firstName){
        try {
            if (Character.isDigit(firstName.charAt(0)) ){
                throw new Exception("name must not start with digits");
            }
            this.firstName = firstName;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return firstName.length() > 3? "long": "short";
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
       try {
           if (phone.length() == 10 && phone.startsWith("05")) {
               this.phone = phone;
           } else {
               throw new Exception("Phone number should stars with 05 and length is 10 number ");
           }
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return  age;
    }

    public double getGpa(){
        return gpa;
    }

    public String fullName(){
        return "full name is: " + getFirstName() + " " + getLastName();
    }

    public String printFullInfo(){
        System.out.println(fullName());
        return "Your age: " + getAge()
                +" \nYour email: " + getEmail()
                + "\nYour phone number: " + getPhone()
                + "\nYour GPA: " + getGpa()
                + "\n --------------------------";
    }

}
