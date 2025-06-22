package employee_management;

public class Main {
	public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Alice", "Developer", 60000));
        manager.addEmployee(new Employee(102, "Bob", "Manager", 80000));
        manager.addEmployee(new Employee(103, "Charlie", "Analyst", 50000));

        System.out.println("\nAll Employees:");
        manager.displayAll();

        System.out.println("\nSearching for Employee ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Employee not found.");

        System.out.println("\nDeleting Employee ID 101:");
        manager.deleteEmployee(101);

        System.out.println("\nAll Employees after deletion:");
        manager.displayAll();
    }
}