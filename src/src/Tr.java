class P{
	int i,j;
 void m1(int i,float j) {
		System.out.println("siri");
	}

 void m1(float j,int i) {
	System.out.println("jyo");
}
}
public class Tr{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p=new P();
		p.m1(10,10);
		p.m1(23.4f, 4.3f);
		p.m1(12, 12.5f);
		p.m1(10.f, 23);
	}

}
