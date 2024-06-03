package arrayTask;

public class FirstAndLast {
	public static String firstLast(int[] x, int num) {
		int n = -1, a = 0, b = 0, first = -1, last = -1;
		for (int m = 0; m < 1; m++) {
			for (int i = 0; i < x.length - 1; i++) {
				if (x[i] == num)
					a = i;
			}
			for (int j = x.length - 1; j >= 0; j--) {
				if (x[j] == num)
					b = j;
			}

			return b + " " + a;
		}
		return "there is no element";
	}

	public static void main(String[] args) {
		System.out.println(firstLast(new int[] { 1, 3, 4, 5, 1 }, 3));

	}

}
