package pattern;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int a=sc.nextInt();
		pattern1(a);
		sc.close();
		}
		public static void pattern1(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
