package arrayTask;

public class NearestNum {
	public static int nearNum(int arr[], int num) {
		if (arr == null || arr.length == 0)
			return Integer.MIN_VALUE;
		int nearest = arr[0];
		int diff = Math.abs(num - nearest);
		for (int i = 0; i < arr.length; i++) {
			int currentdifference = Math.abs(num - arr[i]);
			if (currentdifference < diff) {
				nearest = arr[i];
				diff = currentdifference;
			}

		}
		return nearest;
	}

	public static void main(String[] args) {
		System.out.println(nearNum(new int[] {0, -1,0, -3, 5, -6, -7,1, 3, 9,11, 12 }, 1));
	}

}
