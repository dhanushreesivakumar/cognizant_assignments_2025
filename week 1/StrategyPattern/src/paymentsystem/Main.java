package paymentsystem;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        PaymentContext context = new PaymentContext();

	        System.out.println("Choose payment method:");
	        System.out.println("1. Credit Card");
	        System.out.println("2. PayPal");
	        System.out.print("Enter choice (1 or 2): ");
	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter amount to pay: ");
	        double amount = scanner.nextDouble();
	        scanner.nextLine(); // Consume newline

	        if (choice == 1) {
	            System.out.print("Enter Credit Card Number: ");
	            String cardNumber = scanner.nextLine();
	            context.setPaymentStrategy(new CreditCardPayment(cardNumber));
	        } else if (choice == 2) {
	            System.out.print("Enter PayPal Email: ");
	            String email = scanner.nextLine();
	            context.setPaymentStrategy(new PayPalPayment(email));
	        } else {
	            System.out.println("Invalid payment option.");
	            scanner.close();
	            return;
	        }

	        context.pay(amount);
	        scanner.close();
	    }
}
