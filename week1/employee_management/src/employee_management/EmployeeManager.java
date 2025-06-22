package employee_management;

public class EmployeeManager {
	private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }


    public void addEmployee(Employee emp) {
        if (size >= employees.length) {
            System.out.println("Cannot add more employees. Array is full.");
            return;
        }
        employees[size++] = emp;
        System.out.println("Employee added.");
    }


    public Employee searchEmployee(int empId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == empId) {
                return employees[i];
            }
        }
        return null;
    }


    public void displayAll() {
        if (size == 0) {
            System.out.println("No employees to display.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }


    public void deleteEmployee(int empId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == empId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }


        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[--size] = null;
        System.out.println("Employee deleted.");
    }
}