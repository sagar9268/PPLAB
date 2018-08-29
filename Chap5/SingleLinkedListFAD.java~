import java.util.*;
class Link
{
	public int x;
	public Link next;
	public Link(int val)
	{
		x=val;
	}
	public void displayLink()
	{
		System.out.println("X: "+x);
	}
}
class LinkList
{
	Link first;
	public LinkList()
	{
		first=null;
	}
	Boolean isEmpty()
	{
		return(first==null);
	}
	void insertFirst(int val)
	{
		Link newLink = new Link(val);
		newLink.next = first;
		first = newLink;
	}
	public Link find(int key)
	{
		Link current = first;
		while(current.x != key)
		{
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}
	public Link delete(int key)
	{
		Link current = first;
		Link previous = first;
		while(current.x != key)
		{
			if(current.next == null)
				return null;
			else
			{
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}

	void displayList()
	{
		System.out.println("First->Last:\n");
		Link current = first;
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
class LinkListApp
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		LinkList theList = new LinkList();
		System.out.println("Enter the number of values you want to insert:");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter val:");
			int t = s.nextInt();
			theList.insertFirst(t);
		}
		theList.displayList();
		System.out.println("Enetr the value you want to search: ");
		int src = s.nextInt();
		Link f = theList.find(src);
		if( f != null)
			System.out.println("Found link with key: " + f.x);
		else
			System.out.println("Cant find link!");
		System.out.println("Enter the value you want to delete: ");
		int del = s.nextInt();
		Link d = theList.delete(del);
		if( d != null )
			System.out.println("Deleted link with key: " + d.x);
		else
			System.out.println("Can’t delete link!");
		theList.displayList();
	}
}
