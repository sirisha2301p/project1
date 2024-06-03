
public class Cons {
	int i;
	double b;

	public Cons() {
		this(10);
		//System.out.println("empty");
		// TODO Auto-generated constructor stub
	}

	public Cons(int i) {
		this(19.4);
		//System.out.println("int-args");
	}

	public Cons(double b) {
		
		//System.out.println("double args");
	}

	static void m1() {
		int x = 12;
		//System.out.println(x);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		//Cons c = new Cons(112.9);
		Cons c1 = new Cons();
		//c.m1();
		System.out.println("siri");

	}
//public static void m1() {
//	m2();
//}
//public static void m2() {
//	m1();
//}
//public static void main(String args[]) {
//	m1();
//	System.out.println("siri");
//}
}
