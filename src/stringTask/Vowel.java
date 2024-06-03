package stringTask;

import java.util.Scanner;

public class Vowel {
	public static int vowelLength(String s) {
		int count = 0;
		char c[] = s.toCharArray();
		char ch[] = { 'a', 'e', 'i', 'o', 'u' };
		for (char c1 : c) {
			for (char ch1 : ch) {
				if (ch1 == c1)
					count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine().toLowerCase();
		System.out.println(vowelLength(s));

	}
}
