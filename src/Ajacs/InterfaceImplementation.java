package company.Ajacs;

interface Sha {
	double calculateArea();

	double calculatePerimeter();
}

class Circ implements Sha {
	float r = 4;

	public double calculateArea() {

		double area = 3.14 * r * r;
		System.out.println("Area of a Circle");
		return area;
	}

	public double calculatePerimeter() {

		double perimeter = 2 * 3.14 * r;
		System.out.println("perimeter of a Circle");
		return perimeter;
	}
}

class Rectan implements Sha  {
	float l = 4, b = 6;

	public double calculateArea() {
		double area = l * b;
		System.out.println("Area of a Rectangle");
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = 2 * (l + b);
		System.out.println("perimeter of a Rectangle");
		return perimeter;
	}
}

class Trian implements Sha {
	float l = 3, b = 5, h = 5;

	public double calculateArea() {

		double area = 0.5 * b * h;
		System.out.println("Area of a Triangle");
		return area;
	}

	public double calculatePerimeter() {

		double perimeter = l + b + h;
		System.out.println("perimeter of a Triangle");
		return perimeter;
	}
}

public class InterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circ c = new Circ();
		Rectan r = new Rectan();
		Trian t = new Trian();
		System.out.println(c.calculateArea() + " \n" + c.calculatePerimeter());
		System.out.println(r.calculateArea() + " \n" + r.calculatePerimeter());
		System.out.println(t.calculateArea() + " \n" + t.calculatePerimeter());

	}

}
