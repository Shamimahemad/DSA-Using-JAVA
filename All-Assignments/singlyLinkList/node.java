package singlyLinkList;

public class node {
private  int data;
node next;

public node(int data) {
	this.data=data;
	this.next=null;
}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}

public node getNext() {
	return next;
}

public void setNext(node next) {
	this.next = next;
}

}
