package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for(int i = 0;i<arr.length-1 ; i++) {
			for(int j =i+1;j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {9,8,4,7,11,46,52,1,2,6};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
