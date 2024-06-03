package company.Ajacs;

public class Employee {
	private String id;
	private String name;
	private float salary;
	public void getter() {
		id="Aja1090";
		name="shireesha";
		salary=50_000;
	System.out.println("Employee id "+id+"\n"+"Employee name "+name+"\n"+"Employee salary "+salary);
	}
	public float setter(float salary) {
//		id="Apolo1090";
//		name="Sailaja";
//		salary=5_00_000;
	return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();
emp.getter();
System.out.println(emp.setter(123000));
	}

}
