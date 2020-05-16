package chapter4.section1;

public class MySIngleLinkedList<T> {
	public Node<T> head;
	public int size;
	
	public MySIngleLinkedList() {
		head=null;
		this.size=0;
	}
	
	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		
		newNode.next=head;
		head=newNode;
		
		size++;
	}
	
	public void addAfter(Node<T> before, T data) {
		Node<T> temp = new Node<T>(data);
		temp.next=before.next;
		before.next=temp;
	}
	
	public T removeFirst() {
		if(head ==null) {
			return null;
		}
		
		T temp =head.data;
		head=head.next;
		return temp;
	}
	
	public T removeAfter(Node<T> before) {
		if(before.next==null) {
			return null;
		}
		T temp = before.next.data;
		before.next=before.next.next;
		return temp;
	}
	
	public T get(int index) {
		return getNode(index).data;
	}
	
	public int indexOf(T data) {
		Node<T> p= head;
		int index=0;
		while(p!=null) {
			if(p.data.equals(data)) {
				return index;
			}
			p=p.next;
			index++;
		}
		return -1;
	}
	
	public Node<T> getNode(int index){
		if(index<0 || index>= size) {
			return null;
		}
		Node<T> p=head;
		for(int i=0; i<index; i++) {
			p=p.next;
		}
		return p;
	}
	
	public void add(int index, T data) {
		if(index<0 || index>size) {
			return;
		}
		if(index==0) {
			addFirst(data);
		}
		Node<T> q= getNode(index-1);
		addAfter(q,data);
	}
	
	public T remove(int index) {
		if(index<0 || index>=size) {
			return null;
		}
		if(index==0) {
			return removeFirst();
		}
		Node<T> prev=getNode(index-1);
		return removeAfter(prev);
	}
	
	public T remove(T data) {
		Node<T> p =head;
		Node<T> q = null;
		while(p!=null && !p.data.equals(data)) {
			q=p;
			p=p.next;
		}
		
		if(p==null) {
			return null;
		}
		if(q==null) {
			return removeFirst();
		}
		return removeAfter(q);
	}
	
	
	
	public static void main(String[] args) {
		MySIngleLinkedList<String> list = new MySIngleLinkedList<String>();
		list.add(0, "Saturday");
		list.add(1, "Friday");
		list.add(0, "Monday");	// M, S, F
		list.add(2, "Tuesday");		// M, S, T, F
		
		String str=list.get(2);		// str = "Tuesday"
		list.remove(2);		// M, S, F
		
	}
	
}
