package exception;

import java.util.*;

public class DivisionByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer values of 'a' and 'b'");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.out.println(ae+"\n"+ae.getMessage());
		}
		sc.close();

	}

}
