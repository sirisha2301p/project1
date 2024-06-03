
public class ExceptionHandling {
	static {
		System.out.println("static");
		System.exit(0);
	}
public static void main() {
	System.out.println("main()");
	
//	public static void main(String[] args) throws Exception {
//
//		int a = 10;
//		int b = 0;
//		int result = 0,re=0;
//		// result =a/b;
//		try {
//			result = a / b;
//			re=b/a;
//		} catch (ArithmeticException ae) {
//			System.out.println(ae+" \n"+result+re);
//
//		} catch (Exception e) {
//			System.out.println(e+" "+re+" \n"+"exception");
//		} finally
//
//		{
//			System.out.println(result + "\n" + "program completed successfully");
//		}
//		System.out.println("Exception handling");
//	}
}
}