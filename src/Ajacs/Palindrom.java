package company.Ajacs;

public class Palindrom {
	
	public static boolean isPalindrom(int number) {
	int original=number,rev = 0, rem = 0;
	while (number != 0) {
		rem = number % 10;
		rev = rev * 10 + rem;
		number = number / 10;
	}
	//int a=rev;
	//System.out.println(a);
	
	if (original == rev)
		return true;
	return false;
	}
	public static void main(String[] args) {
		int num=1231;
		if(isPalindrom(num))
			System.out.println(num+"Palindrome");
		else
			System.out.println(num+"Not Palindrome");
	}
	
	}


