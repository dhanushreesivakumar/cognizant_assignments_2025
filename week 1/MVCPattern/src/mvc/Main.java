package mvc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student model = new Student("S101", "Default Name", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        System.out.println("Initial Student Info:");
        controller.updateView();

        System.out.print("\nEnter new name: ");
        String name = scanner.nextLine();
        controller.setStudentName(name);

        System.out.print("Enter new grade: ");
        String grade = scanner.nextLine();
        controller.setStudentGrade(grade);

        System.out.println("\nUpdated Student Info:");
        controller.updateView();

        scanner.close();
    }
}
