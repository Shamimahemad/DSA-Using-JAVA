
public class Test {

	public static void main(String[] args) {
	
		SCLL d=new SCLL();
		d.insertAtFirst(12);
		d.insertAtFirst(23);
		d.insertAtFirst(65);
		d.insertAtFirst(62);
		d.insertAtFirst(32);
		d.insertAtFirst(69);
		d.display();
		
		d.insertAtLast(44);
		d.display();
		d.insertAtPos(88, 3);
		d.insertAtLast(8);
		d.insertAtLast(6);
		d.display();
	}

}
