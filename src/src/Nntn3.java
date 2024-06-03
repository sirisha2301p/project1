import java.util.Scanner;
public class Nntn3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year number");
		int num=s.nextInt();
		//int mon=s.nextInt();
		if(num%100==0 && num%4==0 && num%400==0) {
			System.out.println("Leap year");
		}
			//if(num%4!=0)System.out.println("leap year");
		//if(num%4==0)System.out.println("");
			else {
			System.out.println("Not leap year");
		}
			
		}
		}
	


