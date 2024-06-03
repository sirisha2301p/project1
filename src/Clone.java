
public class Clone implements Cloneable{
	int a=10;
	int b=20;

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Clone c=new Clone();
		
		Clone c1=(Clone)c.clone();
		c1.a=199;
		c1.b=200;
		System.out.println(c1.a+"......"+c1.b);
		System.out.println(c.a+"......"+c.b);
	}

}
