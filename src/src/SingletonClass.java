
public class SingletonClass {
	private static SingletonClass s=new SingletonClass();
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		System.out.println("sigleton class");
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass s=SingletonClass.getInstance();
		SingletonClass s1=SingletonClass.getInstance();

	}

}
