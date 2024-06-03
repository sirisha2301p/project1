package exception;

public class SumOfPairs {
	public static String pairs(int arr[],int num) {
		if(arr.length==0|| arr==null)
			return "there is no such pairs";
		String pair="";
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=i+1;j++) {
				if(num==arr[i]+arr[j])
				 pair=pair.concat("("+(arr[i]+","+arr[j])+")"+" ");
				
				
			}
			
		}
		return pair;
	}

	public static void main(String[] args) {
System.out.println(pairs(new int[] {1,2,3,2,4,5,6},5));
	}
	}

