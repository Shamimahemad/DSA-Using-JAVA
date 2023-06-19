
public class Q2 {

	public static void main(String[] args) {
		
		
		int arr[]= {2,5,322,586,76,12};
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			  {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
		System.out.print(" "+arr[k]);	
		}
		System.out.println();
		System.out.println(" third heighest element is "+arr[2]);
		System.out.println(arr.length);
	}
	

}
