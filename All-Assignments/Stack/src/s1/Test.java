package s1;
public class Test {
	
	public static void main(String[] args) {
		Stack s=new Stack(5);
		s.push(12);
		s.push(23);
		s.push(45);
		
		s.display();
		s.pop();
		s.display();
	}

}
