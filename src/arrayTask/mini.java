package arrayTask;

public class mini {
	public static int minimum(int a[]) {
		int min=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					min=a[i];
					a[i]=a[j];
					a[j]=min;
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println(minimum(new int[] {-1,2,3,4,6,7}));

	}

}
