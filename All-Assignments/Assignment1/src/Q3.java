
public class Q3 {

	public static void main(String[] args) {
	
		
		int arr[]= {5, 1 , 7 , 2 , 11,  15 , 23};
		int arr1[]=new int[(arr.length/2)+1];

		   for(int i=0;i<arr.length;i++)
		   {
			   int temp = 0;
			   for(int j = i + 1;j<arr.length;j++){
				 
			   if(arr[i]>arr[j]){
				  temp = arr[j];
				  arr[j]=arr[i];
				  arr[i]=temp;
			   }
			   }
		   }
		  
		   for ( int i=0;i<arr.length;i++ ) {
			   System.out.print( " "+arr[i]);
		   }
		   
		   for( int i=0;i<arr1.length;i++) {
			   arr1[i]=arr[i];
		   }
		   System.out.println();
		   System.out.println("new sub array is");
		   for ( int i=0;i<arr1.length;i++ ) {
			   System.out.print( " "+arr1[i]);
		   }  
		   System.out.println();
		   System.out.println("Maximum length of subarray : "+arr1.length);
	}
	

	}


