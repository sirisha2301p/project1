package string;

public class Intern {

	public static void main(String[] args) {
		String s=new String("siri");
		String s1=s.intern();
		String s2="siri";
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s1==s2);

	}

}
