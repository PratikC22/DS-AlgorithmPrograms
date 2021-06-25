/***************************************************************************************
 * This program checks if two strings are anagrams.
 * 
 * @author Pratik Chaudhari
 * @since 24/06/2021
 ***************************************************************************************/
package algorithm;

import java.util.Arrays;

public class Anagram {

	static boolean checkAnagram(String[] str1, String[] str2) {
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same, then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	// main method
	public static void main(String[] args) {
		// array of two strings
		String[] str1 = { "abcd" };
		String[] str2 = { "dcba" };

		if (checkAnagram(str1, str2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");
	}
}
