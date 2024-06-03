package Arrays;

public class FLele {
	public static void main(String args[]) {
		int a[] = { 1, 2, 4, 3, 45, 2, 3, 2, 56 };
		int f = -1, l = -1;
		int t = 2;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == t && f == -1) {
				f = i;
				System.out.println("first index"+f);
				
				}

			if (a[i] == t && f != -1)
				l = i;
		}
			System.out.println("last index" + l);
		

//		int b = 2, c = 0, d = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == 2) {
//				c = i;
//				break;
//			}
//		}
//		for (int i = a.length - 1; i > 0; i--) {
//			if (a[i] == 2) {
//				d = i;
//				break;
//			}
//		}
		// System.out.println(c + " " + d);
	}
}
