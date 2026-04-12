package week03;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        s1.setFirstName("sara");
        s1.setLastName("ahmad");
        s1.setAge(19);
        s1.setEmail("saraAhmad@gmail.com");
        s1.setGpa(3.5);
        s1.setPhone("0544328894");

        System.out.println("First student: ");
        System.out.println(s1.fullName());
        System.out.println(s1.printFullInfo());

//        System.out.println("Your name is: " + s1.getFirstName() + " " + s1.getLastName());
//        System.out.println("Your age: " + s1.getAge());
//        System.out.println("Your email: " + s1.getEmail());
//        System.out.println("Your phone number: " + s1.getPhone());
//        System.out.println("Your GPA: " + s1.getGpa());
//        System.out.println("--------------------------");


        s2.setFirstName("nora");
        s2.setLastName("khalid");
        s2.setAge(23);
        s2.setEmail("noraKhalid@gmail.com");
        s2.setGpa(4.5);
        s2.setPhone("0545092354");

        System.out.println("Second student: ");
        System.out.println(s2.printFullInfo());

//        System.out.println("Your name is: " + s2.getFirstName() + " " + s2.getLastName());
//        System.out.println("Your age: " + s2.getAge());
//        System.out.println("Your email: " + s2.getEmail());
//        System.out.println("Your phone number: " + s2.getPhone());
//        System.out.println("Your GPA: " + s2.getGpa());
//        System.out.println("--------------------------");


        s3.setFirstName("rahaf");
        s3.setLastName("khalid");
        s3.setAge(23);
        s3.setEmail("rahafKhalid@gmail.com");
        s3.setGpa(5);
        s3.setPhone("0545093408");

        System.out.println("Third student: ");
        System.out.println(s3.printFullInfo());
//        System.out.println("Your name is: " + s3.getFirstName() + " " + s3.getLastName());
//        System.out.println("Your age: " + s3.getAge());
//        System.out.println("Your email: " + s3.getEmail());
//        System.out.println("Your phone number: " + s3.getPhone());
//        System.out.println("Your GPA: " + s3.getGpa());
//        System.out.println("--------------------------");


        s4.setFirstName("ahmed");
        s4.setLastName("omar");
        s4.setAge(20);
        s4.setEmail("ahmedOmer@gmail.com");
        s4.setGpa(4.7);
        s4.setPhone("0542084344");

        System.out.println("Forth student: ");
        System.out.println(s4.printFullInfo());

//        System.out.println("Your name is: " + s4.getFirstName() + " " + s4.getLastName());
//        System.out.println("Your age: " + s4.getAge());
//        System.out.println("Your email: " + s4.getEmail());
//        System.out.println("Your phone number: " + s4.getPhone());
//        System.out.println("Your GPA: " + s4.getGpa());
//        System.out.println("--------------------------");



        Student s5 = new Student("hessah", "omer", "0598246924", "hessahOmer@gmail.com", 25, 4.5);
        Student s6 = new Student("rand", "abdulaziz", "0599432220", "randAbdulazizz@gmail.com", 20, 4.8);

        System.out.println("fifth student: ");
        System.out.println(s5.printFullInfo());

        System.out.println("Sixth student: ");
        System.out.println(s6.printFullInfo());

//        System.out.println("Your name is: " + s6.getFirstName() + " " + s6.getLastName());
//        System.out.println("Your age: " + s6.getAge());
//        System.out.println("Your email: " + s6.getEmail());
//        System.out.println("Your phone number: " + s6.getPhone());
//        System.out.println("Your GPA: " + s6.getGpa());
//        System.out.println("--------------------------");
//

//        System.out.println("Your name is: " + s7.getFirstName() + " " + s7.getLastName());
//        System.out.println("Your age: " + s7.getAge());
//        System.out.println("Your email: " + s7.getEmail());
//        System.out.println("Your phone number: " + s7.getPhone());
//        System.out.println("Your GPA: " + s7.getGpa());
//        System.out.println("--------------------------");


    }

}
