package week04.day01.day01_exercise;
import java.util.Scanner;

class GoogleLogin extends Login {
    Scanner input = new Scanner(System.in);

    @Override
    protected boolean authenticate(String email) {

        if (email.endsWith("@gmail.com")) {
            System.out.println("Google Login Successful");
            return true;
        } else {
            System.out.println("Must be a Gmail account");
            return false;
        }
    }
}