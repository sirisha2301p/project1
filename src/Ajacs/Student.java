package company.Ajacs;

public class Student {
	String id,name;
	int age;
	public Student(String id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println(id+"\t"+name+"\t"+age);
	}
	public Student(String id,String name) {
		System.out.println(id+"\t"+name);
	}
	public Student(String id) {
		System.out.println(id);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student("siri");
Student s2=new Student("Aja1090","siri");
Student s3=new Student("Aja1090","siri",21);
//Student s4=new Student("Aja1090",23);

	}

}
