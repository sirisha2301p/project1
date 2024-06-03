import java.util.Scanner;
public class Nntn2 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of a month");
	int num=s.nextInt();
	switch(num) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.println("31 days in this month.. ");
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.println("30 days in this month..");
		break;
	case 2:
		System.out.println("28 or 29 in this month.. ");
		break;
		
default:
		System.out.println("invalid month.. ");
	}
}
}
