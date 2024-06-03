import java.util.*;

class Acc {
	String accnum;
	private double amount;
	private double bal = 1000;

	public Acc(String accnum, double amount) {
		this.accnum = accnum;
		this.amount = amount;
	}

	double deposit(double amount) {
		
			bal += amount;
			return bal;
		}
	

	double withdraw(double amount) {
		if (bal >= amount) {
			bal -= amount;
			return bal;
		} else {
			System.out.println("insufficient funds");
			return amount;
		}
	}
}

public class Etfv {
	public static void main(String args[]) {
		Acc a = new Acc("12343431", 10000);
		a.deposit(3230);
		System.out.println(a.withdraw(2000));
	}
}
