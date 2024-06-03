package tntto;

public class SingletonClass {
private static SingletonClass s=new SingletonClass();
private SingletonClass()
{
	
}
public static int singletonMethod() {
System.out.println("singleton class");
	return 10;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass s=SingletonClass.getSingletonClass();
	}

}
