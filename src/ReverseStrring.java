
public class ReverseStrring {
	public static String reversingString(String str) {
		//int a=String.valueOf(str).length();
		//int c=str.length();
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			//System.out.println(reverse);
		}
		return str+"\n"+reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Shireesha";
		System.out.println(reversingString(str));
	}

}
