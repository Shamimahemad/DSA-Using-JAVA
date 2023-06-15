package sorting;

import java.util.Arrays;

public class InsertionSort {

	public InsertionSort() {
		
	}
	public static void insertionSortDesc(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			int j, temp=arr[i];
			for(j=i-1;j>=0 && arr[j]<temp; j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
public static void insertionSortAsc(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			int j, temp=arr[i];
			for(j=i-1;j>=0 && arr[j]>temp; j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {9,8,4,7,11,46,52,1,2,6};
		insertionSortAsc(arr);
		System.out.println(Arrays.toString(arr));

	}

}
