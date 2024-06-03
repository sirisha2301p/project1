
//class ASD{
//	int i;
//	ASD(int i){
//		this.i=i;
//		System.out.println(i);
//	}
//}
public class Student  {
	String name;
	int m1, m2, m3, m4;
	static int count=0;
	void m()
	{
		this();
		count++;
		System.out.println(count);
	}
	public Student(String name, int m1, int m2, int m3, int m4) {
		//super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}

//	public int average(int m1, int m2, int m3, int m4) {
//		System.out.println(name);
//		return ((m1 + m2 + m3 + m4) / 4);
//
//	}
//
//	public int average(int m1, int m2, int m3) {
//		System.out.println(name);
//		return ((m1 + m2 + m3) / 3);
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println();
		Student s1 = new Student("siri",12, 34, 55, 33);
		Student s2 = new Student("siri",12, 34, 55, 33);
		
	}

}
