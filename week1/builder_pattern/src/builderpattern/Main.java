package builderpattern;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter CPU: ");
	        String cpu = scanner.nextLine();

	        System.out.print("Enter RAM: ");
	        String ram = scanner.nextLine();

	        System.out.print("Enter Storage: ");
	        String storage = scanner.nextLine();

	        System.out.print("Enter GPU (optional, press Enter to skip): ");
	        String gpu = scanner.nextLine();

	        Computer.Builder builder = new Computer.Builder()
	            .setCpu(cpu)
	            .setRam(ram)
	            .setStorage(storage);

	        if (!gpu.isEmpty()) {
	            builder.setGpu(gpu);
	        }

	        Computer userComputer = builder.build();

	        System.out.println("\nYour Computer Configuration:");
	        System.out.println(userComputer);

	        scanner.close();
	    }
}