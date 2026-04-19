package week04.day01.day01_exercise;
import java.util.Scanner;

class EmailLogin extends Login {
    Scanner input = new Scanner(System.in);

    @Override
    protected boolean authenticate(String email, String password) {

        if (email.contains("@") && email.endsWith(".com")
                && password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")) {

            return true;
        } else {
            System.out.println("Invalid Email or Password");
            return false;
        }
    }
}
