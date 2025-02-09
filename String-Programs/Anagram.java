package vikas;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// keep & peek Anagram

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one");
		String s1 = sc.next();

		System.out.println("Enter String two");
		String s2 = sc.next();

		if (s1.length() != s2.length()) {
			System.out.println("Given Strings are not anagrams");
			return; // stop program
		}
		// if condition not satisfied

		char a[] = s1.toCharArray(); // String converted in Char Array
		char b[] = s2.toCharArray();

		Arrays.sort(a); // sorting array
		Arrays.sort(b);

		boolean str = Arrays.equals(a, b);

		if (str) {
			System.out.println("Given Strings are anagrams");
		} else {
			System.out.println("Given Strings are not anagrams");
		}

	}
}
/*OUTPUT:Enter String one
keep
Enter String two
peek
Given Strings are anagrams
*/