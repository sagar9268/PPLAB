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
class Stack
{
	private LinkList theList;
	Stack()
	{
		theList = new LinkList();
	}
	public void push(int x)
	{
		theList.insertFirst(x);
	}
	public void pop()
	{
		Link temp = theList.deleteFirst();
		System.out.println("Item popped:"+temp.x);
		
		
	}
	public void displayStack()
	{
		System.out.println("Top->Bottom:"+"\n");
		theList.displayList();
	}
}
class LinkListApp
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		Stack theStack = new Stack();
		System.out.println("Enter the number of values you want to insert:");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter val:");
			int t = s.nextInt();
			theStack.push(t);
		}
		theStack.displayStack();
		/*while(!theList.isEmpty())
		{
			Link aLink = theList.deleteFirst();
			System.out.println("Deleted!");
			aLink.displayLink();
			System.out.println("");
		}*/
		theStack.pop();
		theStack.displayStack();
	}
}
