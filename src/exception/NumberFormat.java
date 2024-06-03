package exception;
import java.util.Scanner;
public class NumberFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		try {
		int a=Integer.parseInt(str);
		System.out.println(a);
		}catch(NumberFormatException nfe) {
			System.out.println(nfe+"\n"+nfe.getMessage());
		}
		sc.close();
	}

}
