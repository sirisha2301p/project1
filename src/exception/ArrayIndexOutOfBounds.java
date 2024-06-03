package exception;
import java.util.Scanner;
public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array index");
		int index=sc.nextInt();
		int array[]=new int[5];
		array[0]=18;
		array[1]=19;
		array[2]=20;
		array[3]=21;
		array[4]=22;
		try {
		System.out.println(array[index]);
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe.getMessage());
		}
		sc.close();
	}

}
