package company.Ajacs;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number=234,rem=0,rev=0;
//		for(int i=number;i!=0;i=i/10) {
//			rem=i%10;
//			rev=rev*10+rem;
//		}
//	System.out.println(rev);
//	}
do {
	rem=number%10;
	rev=rev*10+rem;
	number=number/10;
}while(number!=0);
System.out.println(rev);
}
}