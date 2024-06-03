//
//class Nnf {
//	int a = 10;
//	{
//		m1();
//		System.out.println("instance block");
//	}
//
//	Nnf() {
//		System.out.println("constructor");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main");
//		//Nnf n = new Nnf();
//
//	}
//
//	public void m1() {
//		System.out.println(j);
//	}
//
//	{
//		System.out.println("Parent 2 block");
//	}
//	int j = 20;
//}
//
//public class Nnfv4 extends Nnf {
//	int a = 100;
//	{
//		m1();
//		System.out.println("child instance block");
//	}
//
//	Nnfv4() {
//		System.out.println("child constructor");
//	}
//
//	public static void main(String[] args) {
//
//		Nnfv4 n = new Nnfv4();
//		System.out.println("child main");
//	}
//
//	public void m1() {
//		System.out.println(j);
//	}
//
//	{
//		System.out.println("child 2 instance block");
//	}
//	int j = 200;
//}
class Ammu {
	int a, b, c;

	public Ammu(int e,int f,int g){
		this.a=e;
		this.b = f;
		this.c = g;
	}

	public int add(int e, int f) {
//		this.a = e;
//		this.b = f;
		return a + b;
	}
}

public class Nnfv4 extends Ammu {
	//int a, b, c;

	public Nnfv4(int e,int f,int g){
//		this.a = e;
//		this.b = f;
//		this.c = g;
		super(e,f,g);
		}
		public int add(int e, int f, int g) {
		return a + b + c;
	}
	public static void main(String args[]) {
		Nnfv4 n = new Nnfv4(12,23,44);
		System.out.println(n.add(0, 0));
		
		//System.out.println(n.add(12, 34,23));
//		System.out.println(n.add(10,20,30));
	}
}
