package proxypattern;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        Image image1 = new ProxyImage("nature.jpg");
	        Image image2 = new ProxyImage("city.jpg");
	        Image image3 = new ProxyImage("nature.jpg"); // Same as image1

	        System.out.println("Press Enter to view nature.jpg...");
	        scanner.nextLine();
	        image1.display();

	        System.out.println("Press Enter to view city.jpg...");
	        scanner.nextLine();
	        image2.display();

	        System.out.println("Press Enter to view nature.jpg again (should be cached)...");
	        scanner.nextLine();
	        image3.display();

	        scanner.close();
	    }
}
