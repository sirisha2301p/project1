
class X {
public void m(int... a)
{
System.out.println("sai");	
}
}
class S extends X{
	public void m(int... a) {
System.out.println("jyo");		
	}
}
public class Svnfv{
	public static void main(String a[]) {
		X s=new S();
		s.m(10,20);
	}
}