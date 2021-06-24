/*****************************************************************************************
 * This program Read in a list of words from File. Then prompt the user to enter a word to
 * search the list. The program reports if the search word is found in the list.
 * 
 * @author Pratik Chaudhari
 * @since 24/06/2021
 *****************************************************************************************/
package algorithm;

public class BinarySearchWord {

	public static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m]);

			// Check if x is present at mid
			if (res == 0)
				return m;

			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		return -1;
	}

	public static void main(String[] args) {

		String[] arr = { "Pratik", "Nikhil", "Ajay", "Naveen" };
		String x = "Pratik";
		int result = binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

}
