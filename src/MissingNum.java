import javax.swing.text.AbstractDocument.LeafElement;

public class MissingNum {
	public static int missingNum(int arr[]) {
		
		int b=arr.length,a=0;
		for(int i=0;i<arr.length;i++) {
			a+=arr[i];
		}
			return Math.abs((b*(b+1)/2)-a);
		
		
	}

	public static void main(String[] args) {
		System.out.println(missingNum(new int[] {1,2,4,5,6}));
	}

}
