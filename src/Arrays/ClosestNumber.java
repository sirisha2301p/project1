package Arrays;

import java.util.Arrays;

public class ClosestNumber {
	public static String m(int[] x, int n) {
		int temp = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}

		}
		int a, b, c, d;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == n) {
				a = x[i - 1];
				b = x[i + 1];

				c = n - a;
				d = b - n;

				if (c > d)
					return b + "";
				if (c == d)
					return a + " " + b;
				else
					return a + "";

			}
		}
		return "no such element";
	}

	public static void main(String[] args) {
		// System.out.println(Arrays.toString(m(new int[] { 1, 2,7, 5, 3, 6 }, 4)));
		System.out.println(m(new int[] { 1,2,3,4, 4, 4 ,5}, 4));
	}

}
