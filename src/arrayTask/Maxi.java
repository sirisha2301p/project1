package arrayTask;

public class Maxi {
	public static int maximum(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}
			}
				
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(maximum(new int[] {1,2,3,4,5,67,8}));

	}

}
