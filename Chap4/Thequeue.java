import java.util.*;
class Queue
{
	private int x[];
	private int rear,front,maxSize;
	int nItems;
	Queue(int s)
	{
		rear=0;
		front=0;
		nItems=0;
		maxSize=s;
		x = new int[s];
	}
	public void insert(int val)
	{
		if(isFull())
			System.out.println("Queue full !");
		else
		{
			x[rear++] = val;
			nItems++;
		}
	}
	public void remove()
	{
		if(!isEmpty())
		{
			System.out.println(x[front++]);
			nItems--;
		}
		else
			System.out.println("Queue is Empty !");
	}
	public boolean isEmpty()
	{
		if(front==rear && rear!=0 && front !=0)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(rear==maxSize)
			return true;
		else
			return false;
	}
}
class LinearQueueApp
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of queue:");
		int n = s.nextInt();
		Queue q = new Queue(n);
		System.out.println("Enter the number of entries you want to insert:");
		int ele = s.nextInt();
		for(int i=0;i<ele;i++)
		{
			System.out.println("Enter Value:");
			int v = s.nextInt();
			q.insert(v);
		}
		System.out.println("Enter, How many items to remove:");
		int r = s.nextInt();
		for(int i=0;i<r;i++)
		{
			q.remove();
		}
	}
}
