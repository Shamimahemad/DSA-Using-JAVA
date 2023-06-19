import java.util.Scanner;


public class BracketCheckUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack<String> stck= new Stack<String>();
		Stack s1 = new Stack(10);
		Scanner sc = new Scanner(System.in);
		String brcStr = "";
		System.out.println("Enter Bracket String");
		brcStr= sc.next();
		for(int i =0 ; i<brcStr.length();i++ ) {
			if(brcStr.charAt(i)=='('||brcStr.charAt(i)=='{'||brcStr.charAt(i)=='[') {
			s1.push(brcStr.charAt(i));
			}
			if(brcStr.charAt(i)==')'||brcStr.charAt(i)=='}'||brcStr.charAt(i)==']') {
				char c=s1.pop();
				switch(brcStr.charAt(i)) {
				
				}
					
			}
			
		}
		
		s1.display();
		
	}

}
