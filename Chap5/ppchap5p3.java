import java.util.*;
class Link
{
	int data;
	Link next;
	Link(int val)
	{
		data = val;
	}
	void displayLink()
	{
		System.out.println(data+" ");
	}
}
class CircularList
{
	private Link current;
	private Link first;
	public CircularList()
	{
		current = null;
	}
	Boolean isEmpty()
	{
		return(current==null);
	}
	void insert(int val)
	{
		Link newLink = new Link(val);
		if(isEmpty())
		{
			current = newLink;
			first = newLink;
		}
		else
		{
			current.next = newLink;
			newLink.next = first;
		}
		current = newLink;
	}
	void search(int val)
	{
		Link firstRef = current;
		do
		{
			if(current.data == val)
			{
				System.out.println("Value Found !");
				return;
			}
			current = current.next;
		}while(current != firstRef);
		System.out.println("Value not Found !");
	}
	Link delete()
	{
		Link temp,delCurrent;
		delCurrent  = current;
		temp = current.next;
		while(current.next != delCurrent)
		{
			current = current.next;
		}
		current.next = temp;
		return delCurrent;
	}
	void displayList()
	{
		System.out.println("First->Last:\n");
		Link firstRef = current;
		do
		{
			current.displayLink();
			current = current.next;
		}while(current != firstRef);
		System.out.println("");
	}
}
class LinkListApp
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		CircularList theList = new CircularList();
		System.out.println("Enter the number of values you want to insert:");
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter val:");
			int t = s.nextInt();
			theList.insert(t);
		}
		theList.displayList();
		System.out.println("Enter the value you want to search:");
		int srch = s.nextInt();
		theList.search(srch);
		theList.delete();
		theList.displayList();
	}
}
