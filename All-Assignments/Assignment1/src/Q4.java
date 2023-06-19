import java.util.Scanner;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);	
		System.out.println("Enter number of element you want");
	    int n=sc.nextInt();
	   
//		for ( int i =0; i<arr.length; i++) {
//			System.out.print(" "+arr[i]);
//		}
//		System.out.println();
//		
	 if(n%2==0)
	 { 
		 System.out.println("Enter array elements");
			int arr[]=new int[n];
		int middle=arr.length/2-1;
		int middle_=middle+1;
		System.out.println(arr[middle]);
         int temp=arr[middle];
         arr[middle]=arr[middle_];
         arr[middle_]=temp;
         System.out.println();
         
         System.out.println("Final array is");
         for ( int i =0; i<arr.length; i++) 
        {
 			System.out.print(" "+arr[i]);
 		}
	}
	 else
	 {
		 System.out.println("OOPs You Even number of count");
	 }

}}
