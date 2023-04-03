import java.util.*;
public class SearchElement {
	
	int a[]=new int[10];
	Scanner sc=new Scanner(System.in);
	public void getData()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("enter array element: "+i);
			a[i]=sc.nextInt();
			// 1 2 3 4 5 6 7 8 9 10
		}
	}
	public void search()
	{
		int count=0;
		System.out.println("enter array element: ");
		int key=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			if(a[i]==key)
			{
				System.out.println("array element is found at : "+i);
				count++;
			}
			
		}
		if (count==0)
		{
			System.out.println("array element is not found");
			System.out.print("Again ");
			search();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElement sa=new SearchElement();
		sa.getData();
		sa.search();
	}

}
