package arrayTask;

public class sumOfArrayElements {

	int sum(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 10, 23, 4, 6, 4, 5 };
		sumOfArrayElements s = new sumOfArrayElements();
		System.out.println(s.sum(array));
	}
}
