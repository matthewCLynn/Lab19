package dsa;

public class MyLinkedList implements MyList {

	
	private Node head;
	private int myLength = 0;
	private Node tail;
	
	
	public Node getTail() {
		return tail;
	}


//	public void setTail(Node node) {
//		tail = node.getNodeAt(myLength-1);
//	}


	public MyLinkedList()
	{
		
	}

	
	public MyLinkedList(Node head, int myLength) {
		super();
		this.head = head;
		this.myLength = myLength;
	}


	@Override
	public void addAtBeginning(String cheese)
	{
		
		
		//add a New Node and set it to the head
		head = new Node(head, cheese);
		myLength++;
	}

	@Override
	public void removeFromBeginning() {
		head = head.getNext();
		myLength--;
		
	}

	
	// created a helper method to get the node at a certain location
		// to help us prevent some code duplication
	private Node getNodeAt(int index) {
		Node node = head;
			for (int i = 0; i < index; i++) {
				if (node == null) {
					return null;
				}
				node = node.getNext();
			}
			return node;
		}
	
	@Override
	public void addAtEnd(String up)
	{
		Node node = new Node(null,up);
		Node tail = getNodeAt(myLength-1);
		tail.setNext(node);
		myLength++;	
		
	}
	
	public Boolean removeAt(int index)
	{
		Node node = head;
		if(index > myLength)
			return false;
		if(index == 0)
		{
			head = node.getNext();
			myLength--;
		}
		
		else
		{
		for(int i = 0; i<index-1; i++)
			node = node.getNext();
		
		node.setNext(node.getNext().getNext());
		myLength--;
		}
		return true;
	}

	public Boolean insertAt(int index, String cheese)
	{
		Node node = head;
		Node newNode = (new Node(node,cheese));
		if(index > myLength)
			return false;
		if(index == 0)
		{
			addAtBeginning(cheese);
		}
		
		else
		{
		for(int i = 0; i<index-1; i++)
			node = node.getNext();
		
		newNode.setNext(node.getNext());
		node.setNext(newNode);
		myLength++;
		}
		return true;
	}
	
	@Override
	public void removeFromEnd() {
		if(myLength<2)
			head.setNext(null);
		
		Node newTail = getNodeAt(myLength-2);
		newTail.setNext(null);
		myLength--;
		
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("[ ");
		Node node = head;
		//follow the links between the nodes until it reaches the end
		while(node != null)
		{
			sb.append(node);
			node = node.getNext();
		}
		sb.append(" ]");
		
		return sb.toString();
	}

}
