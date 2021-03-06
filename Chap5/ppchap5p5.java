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
	void delete(int c)
	{
		Link temp,delCurrent;
		int count=0;
		while(count < c)
		{
			current = current.next;
			count++;
		}
		delCurrent  = current;
		temp = current.next;
		while(current.next != delCurrent)
		{
			current = current.next;
		}
		current.next = temp;
		System.out.println(delCurrent.data);
		//placing pointer to left person
		current = current.next;
	}
	void displayList()
	{
		System.out.println("First->Last:\n");
		//placing pointer at first position
		current=current.next;
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
		System.out.println("Enter the number of people in the circle:");
		int n = s.nextInt();
		//initializing numbers to nodes
		for(int i=0;i<n;i++)
		{
			theList.insert(i+1);
		}
		System.out.println("Enter the number used for counting:");
		int c = s.nextInt();
		theList.displayList();
		for(int i=0;i<n-1;i++)
		{
			theList.delete(c);
		}
		theList.displayList();
	}
}
