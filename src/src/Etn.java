//import java.Math.*;

//
class Etn {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 7, 9, 6, 4, 678 };
		int[] b = { 2, 33, 4, 56, 6, 56, 6, 2 };
		int c = Math.max(a.length, b.length);
		if (a.length == c) {
			int[] sum = new int[c];
			for (int i = 0; i < c; i++) {
				try {
					sum[i] = a[i] + b[i];
				} catch (Exception e) {
					sum[i] = a[i];
				}
			}
			for (int num : sum) {
				System.out.print(num + " ");
			}
		} else {
			int[] sum = new int[c];
			for (int i = 0; i < c; i++) {
				try {
					sum[i] = a[i] + b[i];
				} 
				catch (Exception e) {
					sum[i] = b[i];
				}
			}
			for (int num : sum) {
				System.out.print(num + " ");
			}
		}
	}
}