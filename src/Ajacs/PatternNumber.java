package company.Ajacs;

public class PatternNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int h=4;
		for(int i=1;i<=h;i++) {
			System.out.print(" ".repeat(n-1));
			for(int j=1;j<i+1;j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
			n-=1;

//		for (int i = 1; i <= h; i++) {
//			System.out.print(" ".repeat(n - 1));
//			for (int j = 1; j < i + 1; j++) {
//				System.out.print(i + " ");
//				
//			}
//
//			System.out.println("");
//			n -= 1;

		}
	}

}
