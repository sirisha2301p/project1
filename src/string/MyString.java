package string;

public class MyString {
String s;
public MyString(String s) {
	this.s=s;
}
	public static void main(String[] args) {
		System.out.println("helllo"+new StringBuffer("java se8"));
		System.out.println("helllo"+new MyString("java se8"));
		}

}
