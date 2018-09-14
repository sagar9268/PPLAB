import java.util.*;
class Link
{
	public long dData;
	public Link right;
	public Link down;
	public Link(long d)
	{
		dData = d;
	}
	public Link()
	{
		dData = 0;
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
	public DoublyLinkedList(int r,int c)
	{
		first = null;
		init(r,c);
	}
	public void init(int r,int c)
	{
		if(isEmpty())
		{
			Link newLink = new Link();
			first = newLink;
			Link newLink2 = new Link();
			first.down = newLink2;
		}
		Link current = first;
		Link currentDown = first.down;
		for(int rc=0;rc<r;rc++)
		{
			for(int cc=0;cc<c;cc++)
			{
				Link newLinkRight = new Link();
				current.right = newLinkRight;
				Link newLinkDown = new Link();
				current.down = newLinkDown;
				if(cc==0)
					currentDown = newLinkDown;
				current = current.right;
			}
			current = currentDown;
			Link newLink3 = new Link();
			current.down = newLink3;
			currentDown = newLink3;
		}
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	public void insert(long dd,int r,int c)
	{
		Link current = first;
		Link newLink = new Link(dd);
		int rc=1,cc=1;
		while(rc<r)
		{
			current = current.down;
			rc++;
		}
		while(cc<c)
		{
			current = current.right;
			cc++;
		}
		current.dData = newLink.dData;
	}
	public void displayMatrix(int r,int c)
	{
		System.out.print("Matrix: \n");
		Link current = first;
		Link currentDown = first.down;
		int rc=0,cc=0;
		while(rc<r)
		{
			cc=0;
			while(cc<c)
			{
				current.displayLink();
				current = current.right;
				
				cc++;
			}
			System.out.println("");
			current = currentDown;
			currentDown = currentDown.down;
			rc++;
		}
		System.out.println("");
	}
}
class DoublyLinkedApp
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of matrix (Rows & Columns):");
		int r = s.nextInt();
		int c = s.nextInt();
		DoublyLinkedList theList = new DoublyLinkedList(r,c);
		theList.displayMatrix(r,c);
		char ch;
		do
		{
			System.out.println("Enter the position you want to insert:(Row & Column):");
			int rp = s.nextInt();
			int cp = s.nextInt();
			System.out.println("Enter the value:");
			long val = s.nextLong();
			theList.insert(val,rp,cp);
			System.out.println("Do you want to insert more? (y/n) :");
			ch = s.next().charAt(0);
		}while(ch=='y');
		theList.displayMatrix(r,c);
	}
}
