package sorting;

public class Main {
	public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 2500.50),
            new Order(102, "Bob", 1500.00),
            new Order(103, "Charlie", 4000.75),
            new Order(104, "Diana", 2200.20)
        };

        System.out.println("Original Orders:");
        displayOrders(orders);

        // Bubble Sort
        OrderSorter.bubbleSort(orders);
        System.out.println("\nOrders after Bubble Sort (by totalPrice):");
        displayOrders(orders);

        // New unsorted array for Quick Sort
        Order[] quickOrders = {
            new Order(101, "Alice", 2500.50),
            new Order(102, "Bob", 1500.00),
            new Order(103, "Charlie", 4000.75),
            new Order(104, "Diana", 2200.20)
        };

        OrderSorter.quickSort(quickOrders, 0, quickOrders.length - 1);
        System.out.println("\nOrders after Quick Sort (by totalPrice):");
        displayOrders(quickOrders);
    }

    public static void displayOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
