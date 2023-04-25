// collection of nodes 
// 1st node  -  head 
public class LinkedList {
	
	Node head;

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	// delete by position 
	// delete by value 
	public void insertData(int value , int pos ) {	
		//System.out.println(" in insertData ");
				Node newNode  = new Node(value);
				
				int count  = 0 ;
				if(head == null) {			
					head = newNode; 
				} else {  
					Node temp= head ; 
					while ((temp.next != null) && (count != pos)){		
						count += 1;//3
						temp = temp.next;				
					}
			
					temp.next = newNode;				
				}
	}
	
	// insert at end of Linked 
	// iterate till tail node 
	public void insertData(int value) {		
		//System.out.println(" in insertData ");
		Node newNode  = new Node(value);	// 15	
		if(head == null) {			
			head = newNode;// 1st element 
		} else {  //iterate till tail node 	 tail.next = null 		
			Node temp= head ; 
			while (temp.next != null ){				
				temp = temp.next;				
			}			
			temp.next = newNode;				
		}
	}
	
	// Linked List === nodes 
	// start ----- end 
	// head  ----------- tail.next = null
	public void displayData() {
		/// head nODE  ----- tail.next  = null 
		Node temp = head ; 
		while (temp.next != null) {
			System.out.print(temp.data + "  " );
			
			temp = temp.next;
		}
		System.out.print(temp.data + "  " );
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
