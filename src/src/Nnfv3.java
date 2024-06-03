class Base{
	static int i=10;
	static {
		m1();
	System.out.println("base static block");
	}
	static public void main(String args[]) {
		m1();
		System.out.println("base class");
	}
	static public void m1() {
		System.out.println(j);
	}
	static int j=20;
}
class Nnfv3 extends Base {
//	public static int x=m1();
//	
//	
//	public static int m1(){
//		System.err.println("this is static block");
//		System.exit(0);
//		return 10;
//	}}
//public class  Nnfv3{
//	static M m=new M();{
//	System.out.println(m.m1());
//	System.exit(0);
//}}
	static int x=100;
	static {
		m2();
		System.out.println("derived 1 class ");
	}
	public static void main(String args[]) {
		m2();
		System.out.println("derived main class");
	}
	static {
		System.out.println("derived 2 class");
	}
	public static void m2() {
		System.out.println(y);
	}
	static public int y=200; 
}
