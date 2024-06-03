package string;

public class Widening {
	public static void m1(Integer i) {
		System.out.println("Autoboxing");
	}

	public static void m1(long l) {
		System.out.println("Widening");
	}

	public static void main(String[] args) {
		int I = 10;
		m1(10);

	}

}
