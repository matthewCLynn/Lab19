package dsa;

import java.util.LinkedList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyArrayList list = new MyArrayList();
		list.addAtBeginning("hello");
		list.addAtBeginning("hello2");
		list.addAtBeginning("hello3");
		list.addAtBeginning("hello4");
		list.removeFromBeginning();
		list.removeFromEnd();
		list.addAtEnd("get out");
		System.out.println(list);
		
		System.out.println("\nLinkedList starts here: ");
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtBeginning("I hate this");
		linkedList.addAtBeginning("I love this");
		linkedList.addAtBeginning("HALP1");
		linkedList.addAtBeginning("HALP2");
		System.out.println(linkedList);
		linkedList.removeFromBeginning();
		System.out.println(linkedList);
		linkedList.addAtEnd("WE WIN");
		System.out.println(linkedList);
		linkedList.removeAt(1);
		System.out.println(linkedList);
		linkedList.insertAt(2, "we aren't even testing on this...");
		System.out.println(linkedList);
		
		
		
		
	
	}
	
	

}
