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
	Link last;
	public LinkList()
	{
		first=null;
		last=null;
	}
	Boolean isEmpty()
	{
		return(first==null);
	}
	void insertFirst(int val)
	{
		Link newLink = new Link(val);
		if(isEmpty())
			last = newLink;
		newLink.next = first;
		first = newLink;
	}
	void insertLast(int val)
	{
		Link newLink = new Link(val);
		if(isEmpty())
			first = newLink;
		else
			last.next = newLink;
		last = newLink;
	}
	Link deleteFirst()
	{
		Link temp = first;
		if(first.next==null)
			last=null;
		first = first.next;
		return temp;
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
		System.out.println("Enter the number of values you want to insert at start:");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter val:");
			int t = s.nextInt();
			theList.insertFirst(t);
		}
		theList.displayList();
		System.out.println("Enter the number of values you want to insert at last:");
		n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter val:");
			int t = s.nextInt();
			theList.insertLast(t);
		}
		Link aLink = theList.deleteFirst();
		System.out.println("Deleted!");
		aLink.displayLink();
		System.out.println("");
		aLink = theList.deleteFirst();
		System.out.println("Deleted!");
		aLink.displayLink();
		System.out.println("");
		theList.displayList();
	}
}