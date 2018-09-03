class Link
{
	public long dData;
	public Link next;
	public Link previous;
	public Link(long d)
	{
		dData = d;
	}
	public void displayLink()
	{
		System.out.print(dData + " ");
	}
}
class DoublyLinkedList
{
	private Link first;
	private Link last;
	public DoublyLinkedList()
	{
		first = null;
		last = null;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	public void insertLeft(long dd)
	{
		Link newLink = new Link(dd);
		if( isEmpty() )
			last = newLink;
		else
			first.previous = newLink;
		newLink.next = first;
		first = newLink;
	}
	public void insertRight(long dd)
	{
		Link newLink = new Link(dd);
		if( isEmpty() )
			first = newLink;
		else
		{
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
	public Link deleteLeft()
	{
		Link temp = first;
		if(first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}
	public Link deleteRight()
	{
		Link temp = last;
		if(first.next == null)
			first = null;
		else
			last.previous.next = null;
		last = last.previous;
		return temp;
	}
	public boolean insertAfter(long key, long dd)
	{
		Link current = first;
		while(current.dData != key)
		{
			current = current.next;
			if(current == null)
				return false;
		}
		Link newLink = new Link(dd);
		if(current==last)
		{
			newLink.next = null;
			last = newLink;
		}
		else
		{
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}
	public Link deleteKey(long key)
	{
		Link current = first;
		while(current.dData != key)
		{
			current = current.next;
			if(current == null)
				return null;
		}
		if(current==first)
			first = current.next;
		else
			current.previous.next = current.next;
		if(current==last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		return current;
	}
	public void displayLefttoRight()
	{
		System.out.print("List (left-->right): ");
		Link current = first;
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	public void displayRighttoLeft()
	{
		System.out.print("List (right-->left): ");
		Link current = last;
		while(current != null)
		{
			current.displayLink();
			current = current.previous;
		}
		System.out.println("");
	}
}
class DoublyLinkedApp
{
	public static void main(String[] args)
	{
		DoublyLinkedList theList = new DoublyLinkedList();
		theList.insertLeft(22);
		theList.insertLeft(44);
		theList.insertLeft(66);
		theList.insertRight(11);
		theList.insertRight(33);
		theList.insertRight(55);
		theList.displayLefttoRight();
		theList.displayRighttoLeft();
		theList.deleteLeft();
		theList.deleteRight();
		theList.deleteKey(11);
		theList.displayLefttoRight();
		theList.insertAfter(22, 77);
		theList.insertAfter(33, 88);
		theList.displayLefttoRight();
	}
}
