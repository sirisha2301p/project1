package arrayTask;

import java.util.Arrays;

public class UnwantedChar {
	private static String[] unwanted(String[] s, String regex) {
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll(regex, "");
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(unwanted(new String[] { "siri", "jyothi",
				"sailu", "sirii", "abcdef" }, "[ri]")));
	}

}
