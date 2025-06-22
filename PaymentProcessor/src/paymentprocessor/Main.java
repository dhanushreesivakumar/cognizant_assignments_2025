package paymentprocessor;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Select Payment Method:");
	        System.out.println("1. PayPal");
	        System.out.println("2. Stripe");
	        System.out.print("Enter choice (1 or 2): ");
	        int choice = scanner.nextInt();

	        System.out.print("Enter amount to pay: ");
	        double amount = scanner.nextDouble();

	        PaymentProcessor processor;

	        if (choice == 1) {
	            processor = (PaymentProcessor) new PayPalAdapter();
	        } else if (choice == 2) {
	            processor = (PaymentProcessor) new StripeAdapter();
	        } else {
	            System.out.println("Invalid choice.");
	            scanner.close();
	            return;
	        }

	        processor.processPayment(amount);

	        scanner.close();
	    }
}
