import java.util.*;
public class Q10 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int N=sc.nextInt();
		System.out.println("enter constant");
		int k=sc.nextInt();
		int arr[]= new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		for(int j=k-2;j>=0;j--) {
			System.out.print(" "+arr[j]);
		}
		System.out.print(" "+arr[k-1]);
		for(int l=arr.length-1;l>=k;l--)
		{
			System.out.print(" "+arr[l]);
		}
		
		
	}

}


