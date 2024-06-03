
public class Pattern {
	public static void pattern(int number) {
		for(int i=0;i<number;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		pattern(number);
		}

}
