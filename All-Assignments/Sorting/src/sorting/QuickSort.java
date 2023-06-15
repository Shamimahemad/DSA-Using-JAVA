package sorting;

import java.util.Arrays;

public class QuickSort{
	
	public static int partion(int arr[],int start,int end) {
		//taking a pivot pointer at last pos
		int pivot = arr[end];
		//check variable created  to track of element smaller than pivot
		int check = start-1;
		for(int j=start;j<end;j++) {
			//checking if the element at j'th pos is smaller than pivot or not
			if(arr[j]<pivot) {
				// if smaller than pivot then increment check by 1 and swap element at check position with j'th position which will be smaller than check position element
				check++;
				int temp = arr[check];
			    arr[check]=arr[j];
				arr[j]=temp;
			}
		}
		//at last when all element smaller than pivot will be at left and greater will be at rigth now is time to put pivot at its correct pos,
		//check was stopped at previous pos of the ele which is greater than pivot so,swap pivot with check+1
		int temp1 = arr[end];
		arr[end]=arr[check+1];
		arr[check+1]=temp1;
		return check+1;
	
	}
	
	public static void quickSort(int arr[],int start,int end) {
		if(start<end) {
			int loc = partion (arr,start,end);
			quickSort(arr,start,loc-1);
			quickSort(arr,loc+1,end);
			
		} 
	}
	public static void main(String[] args) {
		int []arr= { 2, 6, 3, 34, 11, 83, 7,1,5};
		int start=0;
		int end=arr.length-1;
		
		quickSort(arr,start,end);
		System.out.println(Arrays.toString(arr));
	}
}