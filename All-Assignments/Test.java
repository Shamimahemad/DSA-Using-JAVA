
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// time execution 
		int arr [ ] = new int[] {45,78,12,49,11} ;  /// 1005 
		
		ArrayService.displayArray(arr);		
		
	//	ArrayService.sortArray(arr);
		
		//ArrayService.deleteArray(arr ,  2);
		ArrayService.displayArray(arr);
		//ArrayService.sortArray(arr);
		ArrayService.insertArrayElements(arr , 24,2);
		ArrayService.displayArray(arr);

	}

}
