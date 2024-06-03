
public class Tnfv {
//	{
//		System.out.println("Fib");
//	}
//	static {
//		System.out.println("fsb");
//	}
//	public Tnfv() {
//		// TODO Auto-generated constructor stub
//		System.out.println("Constructior");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Tnfv t=new Tnfv();
//		System.out.println("main");
//		Tnfv t1=new Tnfv();
//	}
//	static{
//		System.out.println("ssb");
//	}
//	{
//	System.out.println("sib");	
//	}

	private static String m(String msg) {
		System.out.println(msg);
		return msg;
	}

	public Tnfv() {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
String s=m("3");
	public static void main(String args[]) {
		Tnfv t = new Tnfv();
	}
}
