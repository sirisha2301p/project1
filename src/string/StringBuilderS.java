package string;

public class StringBuilderS {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder(" ");
		String s=" ";
		if(sb.equals(s)) {
			System.out.println("match-1");
		}
		else if(sb.toString().equals(s)) {
			System.out.println("match-2");
		}
		else {
			System.out.println("nomatch");
		}
	}

}
