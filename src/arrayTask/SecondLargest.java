package arrayTask;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargest {
	public static int secondMax(int arr[]) {
		// int array[]=new int[arr.length];

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] >= arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[arr.length-1-i] <arr[arr.length - 1])
				return arr[arr.length-1-i];
		}
		return 0;

	}

	public static void main(String[] args) {
		int a[] = { 1, 2,5,5, 3, 2, 2,4, 4 };
		System.out.println(secondMax(a));

	}

}
