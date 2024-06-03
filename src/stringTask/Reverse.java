package stringTask;

public class Reverse {

	public static void main(String[] args) {
		String s = new String("madam").toLowerCase();
		System.out.println(rev(s));
	}
	public static String rev(String s) {
		String rev = "";
		for (int  i = s.length()-1;i>=0; i--) {
			rev=rev.concat(s.charAt(i)+"");

		}
		if(rev.equals(s))
			return s+" "+"Palindrome";
		return s+" "+"Not a Palindrome";			

	}
}
