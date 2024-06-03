package company.Ajacs;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 17;
		if (number <= 1)
			System.out.println("not a prime");
		else if (number == 2)
			System.out.println("prime");
		else if ( number % 2 == 0 || number % 3 == 0)
			System.out.println("not a prime");
		else {
			for (int i = number; i <= (i / 2) + 1; i++) {
				if (number % i == 0)
					System.out.println("not prime");
				
			}
			System.out.println("Prime");
		}

	}
}
