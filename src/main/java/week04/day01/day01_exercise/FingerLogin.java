package week04.day01.day01_exercise;

class FingerLogin extends Login {

    @Override
    protected boolean authenticate(String email, String pass) {
        System.out.println("Scanning fingerprint...");
        System.out.println("Fingerprint verified");
        return true;
    }
}