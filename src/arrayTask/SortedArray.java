package arrayTask;
import java.util.Arrays;

public class SortedArray {
	public static int[] sortedArray(int[] arr1, int[] arr2) {
		int[] array = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++)
			array[i] = arr1[i];
		for (int j = 0; j < arr2.length; j++)
			array[j + arr1.length] = arr2[j];
		int c = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					c=array[i];
					array[i]= array[j];
					array[j] = c;

				}

			}
		}
		return array;
	}

	public static void main(String[] args) {
		int arr1[] = {1, 3, 2, 5, 6 };
		int arr2[] = { 2, 3, 4, 8 };

		System.out.println(Arrays.toString(sortedArray(arr1, arr2)));

	}

}
