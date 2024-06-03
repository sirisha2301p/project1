package arrayTask;
import java.util.Arrays;
public class CommonElements {
public static String common(int a[],int b[]) {
	int m=0;
	String c="";
	//int c[]=new int[a.length]; for array take this code
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j])
				//c[m++]=a[i];
				c=c.concat(a[i]+"\n");
				
		}
	}
	
	
	return c;
}
	public static void main(String[] args) {
	System.out.println(common(new int[] {1,2,3,4,5,6},new int[] {2,3,4,7,8,9}));
	}

}
