package week03.day04.challengeTask2;

public class EmailNotifier extends BaseNotifier implements Notifier {
    
    public void sendNotification(String recipient, String message) {
        String formattedMessage = formatMessage(message);
        System.out.println("Sending Email to: " + recipient);
        System.out.println(formattedMessage);
        logNotification(recipient);
    }



}
