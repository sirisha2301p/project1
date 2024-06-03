package arrayTask;
import java.util.Arrays;
public class M {
	public static int[] missing(int x[]) {
		int miss=0;
		
		Arrays.sort(x);
		int arr[]=new int[x[x.length-1]];
		for(int i=0;i<x[x.length-1];i++) {
			for(int j=i+1;j<=i+1;j++) {
				if(j-i!=1)
					arr[i]=i;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(missing(new int[] {11,13,14,16})));
	}

}

