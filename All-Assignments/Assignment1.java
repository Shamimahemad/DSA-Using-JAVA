import java.util.*;
public class Assignment1 {
	int a[]=new int[10];
	int b[]=new int[10];
	Scanner sc=new Scanner (System.in);
	
 public void 	getData()
	{
		int i;
		for(i=0;i<10;i++)
		{
			System.out.println("enter element "+i);
			a[i]=sc.nextInt();
		}
	
	}
 public void reverse()
 {
	 int i=9;
		 for(int j=0;j<10;j++)
		 {
			 b[j]=a[i];
			 i--;
		 }
	 
	
	 
 }
 public void display() 
 
 {
	 System.out.println("original array--");
	 for(int i=0;i<10;i++)
	 {
		 System.out.print(a[i]+" ");
     }
	 System.out.println();
	 System.out.println("reversed array--");
	 for(int j=0;j<10;j++)
	 {
		 System.out.print(b[j]+" ");
     }

}
 public static void main(String[] args)
 {
	 Assignment1 as=new Assignment1();
	 as.getData();
	
	 as.reverse();
	 as.display();
 }

}