package decortorpattern;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notifier notifier = new EmailNotifier();

        System.out.print("Add SMS notification? (yes/no): ");
        String sms = scanner.nextLine();

        if (sms.equalsIgnoreCase("yes")) {
            notifier = new SMSNotifierDecorator(notifier);
        }

        System.out.print("Add Slack notification? (yes/no): ");
        String slack = scanner.nextLine();

        if (slack.equalsIgnoreCase("yes")) {
            notifier = new SlackNotifierDecorator(notifier);
        }

        System.out.print("Enter the message to send: ");
        String message = scanner.nextLine();

        notifier.send(message);

        scanner.close();
    }
}