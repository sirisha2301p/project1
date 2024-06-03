package Pack;

 abstract class A {
	 public int door() {
		 System.err.println("error");
		 return 0;
	 }
	 public int wheel() {
		 return 0;
	 } 
  
 }
class B extends A{
	}


public class Ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		System.out.println(b.wheel());
		System.out.println(b.door());

	}

}
