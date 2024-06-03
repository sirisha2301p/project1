package company.Ajacs;

public class MathUtils {
	static double add(float a,float b) {
		return a+b;
	}
	static double subtract(float a,float b) {
		return a-b;
	}
	static double multiply(float a,float b) {
		return a*b;
	}
	static double divide(float a,float b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(subtract(10,20));
		System.out.println(multiply(10,20));
		System.out.println(divide(10,20));
	}

}
