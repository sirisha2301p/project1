import java.util.Scanner;

public class Twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = s.next();
		System.out.println("Enter char");
		char c = s.next().charAt(0);
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				j++;

			}
		}
		System.out.println(j);
	}

}
