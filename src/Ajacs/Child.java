package company.Ajacs;
class Parent{
	 void display() {
		System.out.println("parent class display()");
	}
}
public class Child extends Parent {
	 public void display() {
		System.out.println("child class display()");
		//System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p=new Parent();
p.display();
Child c=new Child();
c.display();
Parent p1=new Child();//method overriding
p1.display();
	}

}
