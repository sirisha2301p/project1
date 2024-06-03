package exception;

import java.util.Scanner;

public class DivisionAndArrayIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers of 'x' and 'y'");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("enter index of an array");
		int[] array = { 10, 20, 30, 40 };
		int index = sc.nextInt();
		try {
			System.out.println(array[index]);
			int c = x / y;
			try {
				System.out.println(c);
			} catch (ArithmeticException ae) {
				System.out.println("enter a positive value morethan 0"+ae);
			}
		} catch (Exception ai) {
			System.out.println("index out of bound" + ai);
		}
		sc.close();

	}

}
