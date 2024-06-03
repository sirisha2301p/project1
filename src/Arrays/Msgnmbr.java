package Arrays;

public class Msgnmbr {

	public static void main(String[] args) {
		int a[]= {1,2,5,6};
		int c=a.length-1;
		//int ab[]=new int[a[a.length-1]];
		System.out.println(a[c]);
		for(int i=0;i<=a[c];i++) {
			if((i+1)!=a[i])
				System.out.println(i+1);
		}
	}

}
