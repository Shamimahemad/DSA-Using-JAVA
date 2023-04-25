
public class ArrayService {

	
	
	public ArrayService() {
		// TODO Auto-generated constructor stub
	}
	
	public static void displayArray(int a[]) {
		for(int i  = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + "  ");
		}
		
		System.out.println();
	}
	
	
	
	
	// compare 2 
	public static  void sortArray(int a[]) {
		for(int i  = 0 ; i < a.length ; i++) {			
			int tmp = 0 ;			
			for (int  j = i+1 ; j<a.length ; j++) {
				if(a[i] > a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					
				}				
			}
		}
	}
	// Memory    without gOOGLE Helper 
	// pos , empty elements zero 
	// empty elements last 
	public static void deleteArray(int a[] , int pos ) 
	{	
		for(int i  = 0 ; i < a.length ; i++) {
			if(i  ==  pos) {
				a[i] = 0 ;
				 
				for (int  j = pos ;  j<(a.length-1) ; j++) {
					
				a[j] = a[j+1];
				
					
		}
			a[a.length-1] = 0;
				
				
			
			}
		}
	}
	
	
	// therotical 
	
	// iterate   for 
	
	public static void insertArrayElements
	(int a[] ,int data ,  int pos ) 
	{
		int n=a.length;
		for(int i=n-1; i>pos ; i--)
		{
			
			a[i]=a[i-1];
			
		}
		a[pos]=data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
