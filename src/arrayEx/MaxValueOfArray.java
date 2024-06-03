package arrayEx;

import java.util.Scanner;

public class MaxValueOfArray {
	public static int maxValue(int array[]) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the elements into an array");
			array[i] = sc.nextInt();
		}
		System.out.println(maxValue(array));
	}

}
