package arrayTask;

public class ReverseAnArray {
	void revers(int array[]) {
		int reverse[]=new int[array.length];
		for(int i=0;i<array.length;i++) {
			reverse[i]=array[array.length-1-i];
			System.out.print(reverse[i]+" ");
		}
		
	}	

	public static void main(String[] args) {
		int[] array = { 23, 34, 54, 45, 65 };
		ReverseAnArray rev=new ReverseAnArray();
		rev.revers(array);
	}

}
