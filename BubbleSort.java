/***************************************************************************************
 * This program reads in integers prints them in sorted order using Bubble Sort.
 * 
 * @author Pratik Chaudhari
 * @since 24/06/2021
 ***************************************************************************************/
package algorithm;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 36, 89, 45, 77, 63, 32 };
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
		System.out.println("Sorted array");
		bs.printArray(arr);
	}

	// computation
	public void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// print method to PrintArrayLength
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int j : arr)
			System.out.print(j + " ");
	}

}
