package exception;

public class StringToNumber {

	public static void main(String[] args) {
		String s = new String("String");
		try {
			int number = Integer.parseInt(s);
			System.out.println(number);
		} catch (NumberFormatException nfe) {
			System.out.println("catch Number Format Exception "+"\n"+nfe);
		}
	}

}
