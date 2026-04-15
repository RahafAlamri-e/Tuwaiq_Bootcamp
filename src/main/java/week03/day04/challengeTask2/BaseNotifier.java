package week03.day04.challengeTask2;

public class BaseNotifier{

    final String formatMessage(String message) {
        return "=== Notification ===\n" + message + "\n====================";
    }

    final void logNotification(String recipient) {
        System.out.println("Notification sent to: " + recipient);
    }
}
