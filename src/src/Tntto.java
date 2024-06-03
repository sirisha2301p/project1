import java.util.*;
//
//public class Tntto {
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in) ;
//		System.out.println("");
//			int n=sc.nextInt();
//		for(int i=1;i<n;i++) {
//			if(i%2==0) {
//			System.out.println(" ");
//			
//				for(int j=1;j<n;j++)System.out.print("");
//				System.out.print(i);
//		}
//	}
//	}
//}
/*import java.util.Scanner;
public class Tntto {
  public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = in.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) 
        {

            for (int spc = n - no_of_spaces; spc > 0; spc--) 
            {
                System.out.print(" ");
            }
            if (i < n) 
            {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else 
            {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) 
            {
                System.out.print(start);
                if (j < count / 2) 
                {
                    start--;
                } else 
                {
                    start++;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
}
*/

import java.util.Arrays;  
public class Tntto  
{  
public static void main(String[] args)   
{  
int[] firstArray = {23,45,12,78,4,90,1};        //source array  
int[] secondArray = {77,11,45,88,32,56,3};  //destination array  
int fal = firstArray.length;        //determines length of firstArray  
int sal = secondArray.length;   //determines length of secondArray  
int[] result = new int[fal + sal];  //resultant array of size first array and second array  
System.arraycopy(firstArray, 0, result, 0, fal);  
System.arraycopy(secondArray, 0, result, fal, sal);  
System.out.println(Arrays.toString(result));    //prints the resultant array  
}  
}  