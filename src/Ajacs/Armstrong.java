package company.Ajacs;

public class Armstrong {
	public static boolean isArmstrong(int number) {
		int rem = 0, arm = 0, original = number,a=0;
		int s = String.valueOf(number).length();
		while(number!=0) {
			rem = number % 10;
			// System.out.println(rem);
			a = (int) Math.pow(rem, s);
			// System.out.println(arm);
			arm = arm + a;
			number=number/10;
			//System.out.println(arm);
		}

		if (original == arm) {
			//System.out.println("true");
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		if (isArmstrong(num))
			System.out.println(num + "  is Armstrong number");
		else
			System.out.println(num + "  is not Armstrong number");
	}
}
