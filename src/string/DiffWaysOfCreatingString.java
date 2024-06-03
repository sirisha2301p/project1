package string;

public class DiffWaysOfCreatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]={'s','i','r','i'};
		byte b[]= {97,98,99,100};
		String s1=new String(ch);
		String s=new String();
		System.out.println(s.isEmpty());
		s1=s1.concat("sha");
		System.out.println(s1.charAt(3));
		String s2=new String("S i r i ");
		System.out.println(s2.trim().length());
		System.out.println(s2.replace('i', 'a'));
		System.out.println(s1.substring(2));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3=new String(b);
		System.out.println(s1+"\n"+s2+"\n"+s3);
	}

}
