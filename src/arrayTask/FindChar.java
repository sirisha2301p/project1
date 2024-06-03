package arrayTask;

import java.util.Arrays;

public class FindChar {
	public static char[] find(char[] ch, char c) {
		int a = 0, d = 0;
		if (ch == null || ch.length == 0)
			return ch ;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				a = i + 1;
			break;}
		}	
		char character[] = new char[ch.length - a];
		for (int j = a; j < ch.length; j++)
			character[d++] = ch[j];
		return character;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(find(new char[] { 'a', 'b', 'c', 'd', 'e', 'f' }, 'c')));
	}

}
