package pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern3(4);
	//}
		int n=4;

	//public static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
			
				System.out.print("  ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
//		for (int i = 0; i < 2 * n; i++) {
//			int condition = i > n ? 2*n-i : i;
//			for (int j = 0; j < condition; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	}
}
