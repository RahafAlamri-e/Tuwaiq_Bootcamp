package week03.day04.challengeTask2;

public class SMSNotifier extends BaseNotifier implements Notifier {

    public SMSNotifier() {
        super();
    }

    public void sendNotification(String recipient, String message) {
        String formattedMessage = formatMessage(message);
        System.out.println("Sending SMS to: " + recipient);
        System.out.println(formattedMessage);
        logNotification(recipient);
    }
}
