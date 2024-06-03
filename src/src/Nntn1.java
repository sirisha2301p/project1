import java.util.Scanner;

public class Nntn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		//System.out.println(char(65));

		if((c>='A'&& c<='Z') || (c>='a'&&c<='z')){
			char a[]= {'a','e','i','o','u','A','E','I','O','U'};	
			for(char b:a) {
				if (b==c) {
			System.out.println("vowel");
			break;
				}else {	
			System.out.println("consonant");
			break;
		}
			}}
		
		else{
			System.out.println("invalid");
		}
		}
		
}
