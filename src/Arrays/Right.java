package Arrays;

import java.util.Arrays;

public class Right {
	public static int[] right(int[] x, int c) {
		for (int i = 0; i < c; i++) {
			int temp = x[x.length - 1];

			for (int j = x.length-1; j > 0; j--) 
				x[j] = x[j - 1];
			x[0] = temp;
		}
		for(int a1:x)
			
		return x;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(right(new int[] { 1, 2, 3, 4, 5 }, 3)));
	}

}
