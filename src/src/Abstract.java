

abstract class Shap{
	public abstract void draw();
	public abstract double calculateArea();
	void m() {
		System.out.println("abstract method");
	}
}
class Circl extends Shap{
	public void draw() {
		System.out.println("Circle");
	}
	public double calculateArea() {
		float radius=5;
		double area=Math.PI*radius*radius;
		return area;
	}
}
class Rectangl extends Shap{
	public void draw() {
		System.out.println("Rectangle");
	}
	public double calculateArea() {
		float length=4,breath=6;
		double area=length*breath;
		return area;
	}
}
class Triangl extends Shap{
	public void draw() {
		System.out.println("Triangle");
	}
	public double calculateArea() {
		float a=5,b=4;
		double area=0.5*a*b;
		return area;
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circl c=new Circl();
		Rectangl r=new Rectangl();
		Triangl t=new Triangl();
		c.draw();
		c.m();
		System.out.println(c.calculateArea());
		r.draw();
		System.out.println(r.calculateArea());
		t.draw();
		System.out.println(t.calculateArea());
		
	}

}
