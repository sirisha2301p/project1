interface Shape {
	double getArea();
}

class Rectangle implements Shape {
	private double a, b;

	public Rectangle(double a,double b) {
		this.a = a;
		this.b = b;
	}

	double getArea(double a, double b) {
		System.out.println(a * b);
	}
}
class circle implements Shape {
	private double r;

	public Rectangle(double r) {
		this.r = r;
		//this.b = b;
	}

	double getArea(double r) {
		System.out.println(3.14*r*r);
	}
}
class  implements Shape {
	private double a, b;

	public Rectangle(double a,double b) {
		this.a = a;
		this.b = b;
	}

	double getArea(double a, double b) {
		System.out.println(a * b);
	}
}

public class Twofv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		t.getArea(12, 34);
		Rectangle r = new Rectangle();
		r.getArea();

	}

}
