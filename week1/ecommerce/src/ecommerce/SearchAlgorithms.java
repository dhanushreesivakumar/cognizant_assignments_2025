package ecommerce;

public class SearchAlgorithms {
	 public static Product linearSearch(Product[] products, String name) {
	        for (Product product : products) {
	            if (product.productName.equalsIgnoreCase(name)) {
	                return product;
	            }
	        }
	        return null;
	    }


	    public static Product binarySearch(Product[] products, String name) {
	        int low = 0, high = products.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int comparison = products[mid].productName.compareToIgnoreCase(name);

	            if (comparison == 0) return products[mid];
	            else if (comparison < 0) low = mid + 1;
	            else high = mid - 1;
	        }
	        return null;
	    }
}