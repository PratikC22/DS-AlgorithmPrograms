/***************************************************************************************
 * This program prints prime numbers in user entered range.
 * 
 * @author Pratik Chaudhari
 * @since 24/06/2021
 ***************************************************************************************/
package algorithm;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower bound : ");
		int start = sc.nextInt();
		System.out.print("Enter upper bound : ");
		int end = sc.nextInt();
		System.out.println("Prime numbers between " + start + " and " + end + " are : ");
		int count;
		for (int i = start; i <= end; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.println(i);
		}
	}
}
