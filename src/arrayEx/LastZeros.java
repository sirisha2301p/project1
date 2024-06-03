package arrayEx;

import java.util.Arrays;

public class LastZeros {
	public static int[] lastZero(int arr[],int s) {
		int[] a = new int[arr.length];
		int c = 0;
		for (int i : arr) {
			if (i != s) {
				a[c++] = i;
			}
			}
		for(int j=c;j<a.length;j++)
			a[j]=s;
		return a;
	}

	public static void main(String[] args) {
		int x[] = { 1, 2, 0, 7, 0, 5, 6 };
		
		System.out.println(Arrays.toString(lastZero(x,7)));
	}

}
