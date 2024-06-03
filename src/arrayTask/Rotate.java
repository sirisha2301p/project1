package arrayTask;

import java.util.Arrays;

public class Rotate {
//	public static void rotate(int arr[], int num) {
//		int[] a = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			
//		System.out.println(Arrays.toString(a));
////			System.out.println(c);
//	}

	public static void main(String[] args) {
		int x[] = { 1, 2, 3, 4, 5 };
		int k=3;
		// System.out.println(Arrays.toString(rotate(x,2)));
		//rotate(x, 2);
		for(int i=0;i<k;i++) {
			int temp=x[x.length-1];
			for(int j=x.length-1;j>0;j--) {
				x[j]=x[j-1];
			}
			x[0]=temp;
			
			}
		for(int x1:x) {
			System.out.println(x1);
		}
	}
}
