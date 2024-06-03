package company.Ajacs;
abstract class Shape{
	public abstract void draw();
	public abstract double calculateArea();
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
	public double calculateArea() {
		float radius=5;
		double area=Math.PI*radius*radius;
		return area;
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
	public double calculateArea() {
		float length=4,breath=6;
		double area=length*breath;
		return area;
	}
}
class Triangle extends Shape{
	public void draw() {
		System.out.println("Triangle");
	}
	public double calculateArea() {
		float a=5,b=4,c=3;
		double area=a*b*c;
		return area;
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		c.draw();
		System.out.println(c.calculateArea());
		r.draw();
		System.out.println(r.calculateArea());
		t.draw();
		System.out.println(t.calculateArea());
	}

}
