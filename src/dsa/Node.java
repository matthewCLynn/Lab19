package dsa;

public class Node
{
	
	private Node next;
	private String data;
	
	public Node()
	{
		
	}
	
	public Node(Node next, String data)
	{
		this.next = next;
		this.data = data;
	}
	
	public void setNext(Node next)
	{
		this.next = next;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	public String getData()
	{
		return data;
	}
	
	public String toString()
	{
		if (next != null)
			return data + " -> ";
	
		return data;
		}
	}

