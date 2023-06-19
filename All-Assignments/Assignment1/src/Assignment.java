
public class Assignment {
	
	public static void main(String[] args)
	{
		int arr[]= {12,5,6,23,54,34,8};
		 int index=0; 
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]==23)
			   {
				   index=i;
				   break;
			   }
		   }
		   System.out.println("index of 23 is "+index);
	}
	

}
