
//class Cons {
//	cons() throws Exception{
//		
//	}
//}

//	Equal() throws Exception {
//		super();
//	}
//
//	public void m1() {
//		System.out.println("sieirioio");
//	}
//
//	public static void main(String[] args) {
//		Equal e = new Cons();
//		e.m1();
// TODO Auto-generated method stub
//		int a=10;
//		int b=20;
//	System.out.println(a==b);
//	System.out.println(a.equals(b));

interface Intern {
	void m1();
}

public class Equal {
	private static Equal e = new Equal();

	private Equal() {

	}

	public static Equal getEqual() {
		System.out.println("siri");
		return e;
	}

	public static void main(String args[]) {
		Equal e = Equal.getEqual();// factory object creation
		// e.getEqual();
		Equal r=Equal.getEqual();
		int a=e.hashCode();
		int b=r.hashCode();
		if(a==b)
			System.out.println(" references are same");
		else
			System.out.println(false);
		
	}
}
//public class Equal {
//	private static Equal e = null;
//
//	private Equal() {
//
//	}
//
//	public static Equal getEqual() {
//		if (e == null)
//			System.out.println("siri");
//		return e;
//	}
//
//	public static void main(String args[]) {
//		Equal e = Equal.getEqual();// factory object creation
//		//e.getEqual();
//	}
//}