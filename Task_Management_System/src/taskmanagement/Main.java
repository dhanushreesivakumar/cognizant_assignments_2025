package taskmanagement;

public class Main {
	public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Design Module", "Pending"));
        taskList.addTask(new Task(2, "Develop Feature", "In Progress"));
        taskList.addTask(new Task(3, "Test System", "Completed"));

        System.out.println("\nAll Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task found = taskList.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("\nDeleting Task ID 1:");
        taskList.deleteTask(1);

        System.out.println("\nAll Tasks After Deletion:");
        taskList.traverseTasks();
    }
}
