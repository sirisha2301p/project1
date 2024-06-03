package string;

public class ExceptionEx {
	
	{
	try {
		{
			int amount=1000;
			if(amount>1000) {
				System.out.println();
			}
			else {
				System.out.println("insufficient funds");
			}
		int a=10,b=0;
		int c=a/b;
		}
		
	}catch(Exception e){
		System.out.println(e);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx eq=new ExceptionEx();
		//eq.m());
		System.out.println("line1");
		System.out.println("line2");
		System.out.println("line3");
		System.out.println("line4");
		System.out.println("line5");
		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			//System.out.println(e);
		}
		System.out.println("line6");
		System.out.println("line7");
		System.out.println("line8");
		System.out.println("line9");
		System.out.println("line10");
	}

}
