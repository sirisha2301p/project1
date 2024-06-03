package string;

public class EmptyString {
public static void main(String args[]) {
	char[] s="shireesha";
	System.out.println(s);
	//s.trim();
	//System.out.println(s.equals("")+"\n"+s.isEmpty());
//	StringBuffer sb=new StringBuffer();
//	System.out.println(sb.capacity());
//	sb.append("asdfghjklzxcvbnm");
//	System.out.println(sb.charAt(17));
//	System.out.println(sb.capacity());
//	sb.append("asdfghjklzxcvbnmuiu");
//	System.out.println(sb.capacity());
//	sb.append("a");
//	System.out.println(sb.capacity());
	StringBuilder sb=new StringBuilder();
	sb.append("shireesha").insert(2,"salaja").insert(2,"xyz").reverse();
	System.out.println(sb);
}
}
