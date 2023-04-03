
public class Pattern5 {
	public static void main(String[] args)
	{
		int a=10;
		for(int i=0;i<a;i++)
		{   
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=a;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for(int i=0;i<a;i++)
		{   
			for(int k=(a-2);k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
