package arrayTask;
import java.util.Arrays;
public class DuplicateCharacters {
	public static String character(char ch[]) {
		String s="";
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])
					s=s.concat(ch[i]+" ");
		}}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(character(new char[] {'s','i','r','i','s','h','a'}));

	}

}
