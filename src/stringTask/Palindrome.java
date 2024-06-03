package stringTask;

public class Palindrome {
	public static String palin(String s) {
		String rev = "";
		for (int  i = s.length()-1;i>=0; i--) {
			rev=rev.concat(s.charAt(i)+"");

		}
		if(rev.equals(s))
			return "Palindrome";
		return "Not a Palindrome";			

	}

	public static void main(String[] args) {
		System.out.println(palin("madam"));
	}

}
