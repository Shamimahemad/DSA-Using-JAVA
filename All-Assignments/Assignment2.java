import java.util.*;

public class Assignment2 {

	int a[]=new int[10];
	int b[]=new int[5];
	int c[]=new int[5];
	// this method accepts a array and prints the value
	public void 	getData()
	
	{
		Scanner sc=new Scanner (System.in);
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("enter element "+i);
			a[i]=sc.nextInt();
		}
	display(a);
	System.out.println();
	
	}
	public void split()
	{
		int pos=5;
		
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<5;i++)
		{
			c[i]=a[pos];
			pos++;
		}
		display(b);
		System.out.println();
		display(c);
	}
	public void display(int arr[])
	{   
	        for (int var : arr) {
	            System.out.print(var + " ");
	        }
	 
	        System.out.println();
	    
	}
	public static void main(String[] args)
	{
		Assignment2 as=new Assignment2();
		as.getData();
		as.split();

	
		
		
	}
	
}
