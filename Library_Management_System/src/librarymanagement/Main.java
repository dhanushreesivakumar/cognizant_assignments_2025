package librarymanagement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Sample book data
	        Book[] books = {
	            new Book(101, "The Alchemist", "Paulo Coelho"),
	            new Book(102, "1984", "George Orwell"),
	            new Book(103, "To Kill a Mockingbird", "Harper Lee"),
	            new Book(104, "Moby Dick", "Herman Melville")
	        };

	        // User input
	        System.out.print("Enter book title to search: ");
	        String searchTitle = scanner.nextLine();

	        // Linear Search
	        Book linearResult = BookSearch.linearSearch(books, searchTitle);
	        System.out.println("\nLinear Search Result:");
	        System.out.println(linearResult != null ? linearResult : "Book not found");

	        // Sort before Binary Search
	        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));

	        // Binary Search
	        Book binaryResult = BookSearch.binarySearch(books, searchTitle);
	        System.out.println("\nBinary Search Result:");
	        System.out.println(binaryResult != null ? binaryResult : "Book not found");

	        scanner.close();
	    }
}
