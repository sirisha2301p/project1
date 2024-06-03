package stringTask;

public class RemoveDuplicates {
	public static String remove(String s) {
		String str = "";
		char[] ch = s.toCharArray();
		int c=0;
		for (int i = 0; i < ch.length ; i++) {
			for (int j = 0; j < ch.length; j++)
				if (ch[i] ==ch[j])
					c++;
			if(c==1)
				str = str.concat(ch[i] + "");
			c=0;
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(remove("sirisha".toLowerCase()));
	}

}
