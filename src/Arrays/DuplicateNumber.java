package Arrays;

import java.util.Arrays;

public class DuplicateNumber {
	public static void duplicate(int arr[]) {
		int a = 0, c = 0;
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			boolean flag=false;
			for (int j = i + 1; j < arr.length ; j++) {
				if ((arr[i] == arr[j]) && (arr[i]!=Integer.MIN_VALUE) && (flag!=true)) {
					sb.append(arr[i]).append(" ");
					System.out.println(arr[i]);
					flag=true;
					arr[j]=Integer.MIN_VALUE;
				}
				if((arr[i]==arr[j]) && (flag==true)) {
					arr[j]=Integer.MIN_VALUE;
				}
			}
		}
		//return array;

	}

	public static void main(String[] args) {
		duplicate(new int[] { 1, 2, 3, 3, 4, 4, 5, 2 });

	}

}
