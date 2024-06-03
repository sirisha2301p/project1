package arrayTask;

public class Duplicate {
	public static String duplicate(int x[]) {
		if (x.length == 0 || x == null)
			return "there is no duplicate";
		String s = "", s1 = "";
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					s = s.concat(x[i] + " ");
				}
				
			}
		}
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s.charAt(j) != s.charAt(i))
//					s1 = s1.concat(s.charAt(j)+"");
//			}
//		}
//		
				
			
		return s.trim();

	}

	public static void main(String[] args) {
		System.out.println(duplicate(new int[] { 1, 2, 4,2, 3, 2, 5 }));

	}

}
