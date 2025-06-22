package di;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl(); // Create repo
        CustomerService service = new CustomerService(repository);    // Inject it

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer ID to search: ");
        String id = scanner.nextLine();

        service.printCustomerDetails(id);

        scanner.close();
    }
}