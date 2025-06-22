package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	 public static void main(String[] args) {
	        Product[] products = {
	            new Product(1, "Laptop", "Electronics"),
	            new Product(2, "Shoes", "Fashion"),
	            new Product(3, "Mobile", "Electronics"),
	            new Product(4, "Book", "Education")
	        };

	        // Linear Search
	        String searchName = "Mobile";
	        Product result1 = SearchAlgorithms.linearSearch(products, searchName);
	        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

	        // Sort before Binary Search
	        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

	        Product result2 = SearchAlgorithms.binarySearch(products, searchName);
	        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
	    }
}
