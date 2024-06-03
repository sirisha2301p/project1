package string;

import java.util.Scanner;

public class EnhanceString {

	public static void main(String[] args) {

		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter city name");
			String name = sc.nextLine().toLowerCase().trim();
			name=name.replaceAll(" ","");
			if (name.equals("hyderabad"))
				System.out.println("Aadaab");
			else if (name.equals("bangaloor"))
				System.out.println("Namshkaar");
			else
				System.out.println("Plese enter valid city name");
			sc.close();
		}

	}
