package homeautomation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Light light = new Light();
        RemoteContro remote = new RemoteContro();

        System.out.println("Home Automation - Light Control");
        System.out.println("1. Turn Light ON");
        System.out.println("2. Turn Light OFF");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            remote.setCommand(new LightOnCommand(light));
        } else if (choice == 2) {
            remote.setCommand(new LightOffCommand(light));
        } else {
            System.out.println("Invalid option.");
            scanner.close();
            return;
        }

        remote.pressButton();
        scanner.close();
    }
}