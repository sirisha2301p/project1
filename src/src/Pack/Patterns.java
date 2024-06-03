package Pack;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {

//		for(int i=0;i<10;i++) {
//			System.out.print("*");
//			for(int j=0;j<i;j++) {
//				System.out.print("-");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<5;i++) {
//			System.out.print("*");
//		}
//		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
//		if (marks <= 100) {
//			if (marks < 35)
//				System.out.println("fail");
//			else if (marks == 35){
//				System.out.println("pass");
//			}
//			else if (marks < 70)
//				System.out.println("third class");
//			else if (marks >= 70) {
//				System.out.println("");
//			} else {
//				System.out.println("first class");
//			}
//		}
//		String sr=s.next();
//		if (sr=="mon")//  "tuesday" || "wednesday" || "thursday" || "friday"))
//	{
//			System.out.println("Uff,It's a weekday");
//	}	else { 
//		System.out.println("Yayy,It'sa weekend");
//		}
		int a = n % 2;
		switch (a) {
		case 1:
			System.out.println("odd");
			break;
		case 0:
			System.out.println("even");
			break;
		default:
			System.out.println("invalid number");
		}
	}
}
