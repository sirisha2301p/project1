package arrayEx;

import java.util.Arrays;

public class LeftShiftArray {
	public static int[] leftShift(int ar[], int num) {
		
		for (int i = 0; i < num; i++) {
			int temp = ar[0];
			for (int j = 0; j < ar.length-1; j++) {
				ar[j ] = ar[j+1];
			}
			ar[ar.length - 1] = temp;
		}
		return ar;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(leftShift(new int[] { 1, 2, 3, 4, 5 }, 2)));
		
	}

}
