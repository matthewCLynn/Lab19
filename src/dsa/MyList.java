package dsa;

public interface MyList
{
	void addAtBeginning(String cheese);
	
	void removeFromBeginning();
	
	void addAtEnd(String up);
	
	void removeFromEnd();
	
	String get(int index);
	
	int size(); //how many items are in the list (aka the length)
	
}
