import java.util.Scanner;
public class Tntto2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("entera number which table you want ");
	int a=s.nextInt();
	int i=1;
		while (i<=10) {
			System.out.println(a+"*"+i+"="+(a*i));
			i++;
		}
	}
}
