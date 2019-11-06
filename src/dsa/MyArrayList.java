package dsa;

import java.util.Arrays;

public class MyArrayList implements MyList {

	private String[] arr = new String[4];
	private int myLength = 0;
	
	//we will use this method as a helper method inside this class
	private boolean isFull()
	{
		return (arr.length == myLength);
	}
	
	//we will use this as a helper mehtod as well to dynamically increase the size
	//of the array
	
	private void doubleLength()
	{
		//make a copy of the array that is twice as long
		arr = Arrays.copyOf(arr, 2*arr.length);
	}
	
	
	public 
	
	
	@Override
	 void addAtBeginning(String cheese) {
		if(isFull())
		doubleLength();
	
		//loop backwards and shift all the items over to make room for the new data
		for(int i=myLength; i>0; i--)
		{
			arr[i]=arr[i-1]; //this is assigning the element that was 
			//before it to the new index
		}
		arr[0] = cheese;
		myLength++;
	}

	@Override
	public void removeFromBeginning()
	{
		if(myLength !=0)
			return;
		for(int i =1; i<myLength; i++)
			arr[i-1]=arr[i];
		myLength--;
	}

	@Override
	public void addAtEnd(String up)
	{
		if(isFull())
		doubleLength();
		arr[myLength] = up;
		myLength++;
		
	}

	@Override
	public void removeFromEnd() {
		
		myLength--;
	}

	@Override
	public String get(int index) {
		if(index >= myLength || index < 0)
			throw new ArrayIndexOutOfBoundsException("index out of bounds");

		return arr[index];
	}

	@Override
	public int size() {
		
		return myLength;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder("[ ");
		for(int i = 0; i < myLength-1; i++)
			sb.append (arr[i] + ", ");
		sb.append(arr[myLength-1] + "]");
		return sb.toString();
	}

}
