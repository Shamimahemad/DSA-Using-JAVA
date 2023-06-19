
public class subArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 1 , 7 , 2 , 11,  5 ,23,41,45,56};
		
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			int subcount=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j-1]<arr[j]) {
					subcount++;
				}else {
					break;
				}
			}
			if(count<subcount) {
				count=subcount;
			}
		}
		
		System.out.println("count "+count);
	}

}
