package pattern;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int a=sc.nextInt();
		pattern2(a);
		sc.close();
		}
	public static void pattern2(int n) {
		
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		for(int i=0;i<n;i++) {
			for(int k=n;k>=i+1;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}}