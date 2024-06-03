import java.util.Arrays;

public class RemoveEle {
	public static int[] remove(int arr[],int value) {
		int c=0;
		for(int ele:arr) 
			if(ele==value)
				c++;
		int[] array1=new int[arr.length-c];
		int j=0;
		for(int i:arr) {
			if(i!=value)
				array1[j++]=i;
		}
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=value)
//				array1[i]=arr[i];
//			System.out.print(array1[i]+" ");
		
	return array1;
	}

	public static void main(String[] args) {
		int array[]= {10,20,30,10,60,65,20,40,10};
		System.out.println(Arrays.toString(remove(array,10)));

	}

}
