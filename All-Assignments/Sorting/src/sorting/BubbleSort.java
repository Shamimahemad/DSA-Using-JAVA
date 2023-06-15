package sorting;

import java.util.Arrays;

public class BubbleSort {

	public BubbleSort() {
		
	}
	public static void bubbleSort(int []arr) {
		for(int j = 0;j<arr.length;j++) {
			boolean flag=false;
			for(int i = 1;i<arr.length-j;i++) {
				if(arr[i]<arr[i-1]) {
					int temp = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
					System.out.println("Unsorted array...");
					flag = true;
					
				}
			}
			if(flag==false) {
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {9,8,4,7,11,46,52,1,2,6,500,890,9};
		int arr1[]= {1,2,3,4,5,6,6,7,8,9,9};
		bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));

	}

}
