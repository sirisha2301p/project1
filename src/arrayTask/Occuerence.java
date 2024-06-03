package arrayTask;

public class Occuerence {

	public static void main(String[] args) {
		char ch[]= {'a','b','c','a','b','a','s'};
		char character='a';
		System.out.println(characters(new char[] {},character));
	}
	public static int characters(char ch[],char c) {
		if(ch.length==0||ch==null)
			return 0;
		int a=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a')
				a++;
		}
		return a;
	}

}
