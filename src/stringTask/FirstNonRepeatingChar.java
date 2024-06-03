package stringTask;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		char[] s = "sirisha".toCharArray();
		int c = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++)
				if (s[i] == s[j]) {
					c++;
				}
			if (c == 1) {
				System.out.println(s[i]);
				break;
			}
			c = 0;
		}
		
	}

}
