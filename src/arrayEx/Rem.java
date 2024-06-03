package arrayEx;

import java.util.Arrays;

public class Rem {
	public static int[] removeEle(int a[],int ele) {
		int c=0;
		for(int i:a) 
			if(i==ele)
				c++;
		int array[]=new int[a.length-c];
		int j=0;
		for(int i:a) 
			if(i!=ele) 
				array[j++]=i;
		
		return array;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,4,1,3,2,1};
		System.out.println(Arrays.toString(removeEle(arr,1)));

	}

}
