package company.Ajacs;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,n=5;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println(b);}
	}

