package string;

public class AutoVsVarargs {
	public static void m1(int... a) {
		System.out.println("var.. args");
	}
	public static void m1(Integer I) {
		System.out.println("Autoboxing");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=10;
		m1(x);
	}

}
