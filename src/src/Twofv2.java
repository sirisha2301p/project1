
interface M{
	abstract void m1();
}
interface II{
	abstract void m1();
}
public class Twofv2 implements M,II {
	public void m1() {
		System.out.println("sirisha");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twofv2 t=new Twofv2();
	t.m1();
	t.m1();\
	
	}

}
