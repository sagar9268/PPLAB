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
		Link temp;
		temp = first;
		first = first.next;
		return temp;
	}
	void displayList()
	{
		Link current = first;
		while(current != null)
		{
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
class Queue
{
	private LinkList theList;
	Queue()
	{
		theList = new LinkList();
	}
	public void insert(int x)
	{
		theList.insertLast(x);
	}
	public void remove()
	{
		Link temp = theList.deleteFirst();
		System.out.println("Item removed:"+temp.x);	
	}
	public void displayQueue()
	{
		System.out.println("Front->Rear:"+"\n");
		theList.displayList();
	}
}
class LinkListApp
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Queue theQueue = new Queue();
		System.out.println("Enter the number of values you want to insert:");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter val:");
			int t = s.nextInt();
			theQueue.insert(t);
		}
		theQueue.displayQueue();
		/*while(!theList.isEmpty())
		{
			Link aLink = theList.deleteFirst();
			System.out.println("Deleted!");
			aLink.displayLink();
			System.out.println("");
		}*/
		theQueue.remove();
		theQueue.displayQueue();
	}
}
