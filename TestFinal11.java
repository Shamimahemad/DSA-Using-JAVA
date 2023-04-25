import java.util.*;

class TestFinal11{

	int i  ; 

		
	public TestFinal11(int i){

		this.i = i;

	}

	public String toString(){
		return "DemoFinal11  [ i ] = " + i ;
	}


	public static void main(String [ ] args){


		Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number : " );
		int temp = sc.nextInt();

		final TestFinal11 tf ; 

		tf  = new TestFinal11(temp) ; //memory 


		System.out.println("First time : " + tf.i);


		System.out.print("Enter a number : " );
		 temp = sc.nextInt();

		//tf = new TestFinal11(temp);

		tf.i = temp;

		System.out.println(tf);   // toString  // hashCode - Memory Location 

		// toString  - Object in String Format 
	}





}