package SamplePackage;


 class SingleLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void printV() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		sl.head.next = second;
		second.next = third;
		sl.printV();
		
		
	}
	
}
