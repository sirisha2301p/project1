package string;

public class Equals {

	public static void main(String[] args) {
		String s1=new String("siri");
		String s2=new String("siri");
		StringBuffer sb1=new StringBuffer("siri");
		StringBuffer sb2=new StringBuffer("siri");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		//System.out.println(s1==sb1);
		System.out.println(s1.equals(sb2));
	}

}
