package sorting;

public class insertion 
     {
		public static void main(String[] args)
		{
			int arr[]= {9,8,4,7,11,46,52,1,2,6};
			int temp=0,j;
			for(int i=1;i<arr.length;i++)
			{
				temp=arr[i];
				for(j=i-1;j>=0 && arr[j]>temp;j--)
				{
					arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}

	}

}
