
public class Pattern2 {
	public static void main(String[] args)
	{
		int i,j,k,row=5;
		
		for( i=1;i<=row;i++)
		{   
			for( k=i;k<row;k++)
			{
				System.out.print(" ");
			}
			
			
			for(j=1;j<=(2*i-1);j++)
			{  
				if(j==1 || i == row || j==(2*i-1))   
				{  
				System.out.print("*");  
				}  
				else
					System.out.print(" ");
			    
			}
			System.out.println();
			
		}
	}

}
