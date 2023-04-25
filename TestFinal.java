class TestFinal{

	int i  ; 

	final int j  = 45;   // constructor

	final int k ; // instance 

	static  int count ; // single copy
	
	public TestFinal(int k){

		this.k = k;

	}
	public static void main(String [ ] args){


		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();

		TestFinal tf = new TestFinal(temp) ; // JVM	

		System.out.println(" j : " + tf.k );

		//tf.j = 89; 
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();

		tf = new TestFinal(temp) ; // JVM	

		System.out.println(" j : " + tf.k );


	}





}