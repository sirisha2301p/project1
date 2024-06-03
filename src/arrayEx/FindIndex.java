package arrayEx;
import java.util.Scanner;
public class FindIndex {
	int findIndex(int array[],int target) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int array[]= {21,32,34,56,67};
		int target=sc.nextInt();
		FindIndex f=new FindIndex();
		System.out.println(f.findIndex(array, target));
		sc.close();

	}

}
