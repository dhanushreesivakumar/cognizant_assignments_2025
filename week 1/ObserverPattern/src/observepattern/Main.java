package observepattern;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        StockMarket market = new StockMarket();

	        Observer mobile1 = new MobileApp("Client A");
	        Observer web1 = new WebApp("Client B");

	        market.register(mobile1);
	        market.register(web1);

	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.print("Enter new stock price (or type 'exit'): ");
	            String input = scanner.nextLine();
	            if (input.equalsIgnoreCase("exit")) break;

	            try {
	                double price = Double.parseDouble(input);
	                market.setPrice(price);
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter a valid number.");
	            }
	        }
	        scanner.close();
	    }
}
