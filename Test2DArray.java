
import   java.util.*;
class Test2DArray
{


	public static void main(String [ ] args){


		int arr[ ] [ ]   = new int [ 3 ][ ] ; //  rows , cols are dynamic 

		arr[0] = new int [2] ; 
	        arr[1] = new int [4] ; 
	        arr[2] = new int [5] ; 	

		Scanner sc = new Scanner(System.in);
		for (int i  = 0 ; i < arr.length ; i++)
		{

			for (int j  = 0 ; j < arr[i].length ; j++)
			{
	                  System.out.println(" Enter a number for arr [ "+ i + " ] [ " +j  +"]") ;

			  arr[i][j] = sc.nextInt();
			}


		}


		for (int i  = 0 ; i < arr.length ; i++)
		{

			for (int j  = 0 ; j < arr[i].length ; j++)
			{
				System.out.print(arr[i] [j] + "  " );
			}

			System.out.println();

		}

			
}












	



}