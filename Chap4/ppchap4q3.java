import java.util.*;
class Dqueue
{
	private int maxSize;
	private int a[];
	private int front;
	private int rear;

	public Dqueue(int max)
	{
		maxSize= max;
		a = new int[maxSize];
		front = -1;
		rear = -1;
	}

	public void insertTop(int s)
       	{
		 if (isFull()) 
		{
			System.out.println("Queue is full");
		}
		else
		{	    
		 if (front == -1)
		 {
		 	rear = 0;
		 	front = 0;
		 }
		 a[front++] = s;         	                     
		}                       
	}

	public boolean isFull()
	{
		if(front==maxSize)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(front==-1 && rear == -1)
			return true;
		else
			return false;
	}
	public void removeTop()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
			front--;
	}
	public int peekTop()
	{
		if(isEmpty())
			return -1;
		else
			return a[front-1];
	}
	
	public void display()
	{
		int i= front-1;
		while(i>=rear)
		{
			System.out.print(a[i]+" ");
			System.out.println("");
			i--;
		}
		System.out.println("");
	}
}

class Stackx
{
	int maxSize;
	int nElems;
	Dqueue theQueue;
	public Stackx(int n)
	{
		maxSize=n;
		nElems=0;
		theQueue = new Dqueue(maxSize);
	}
	public void push(int x)
	{
		if(!isFull())
		{
			nElems++;
			theQueue.insertTop(x);
		}
		else
		{
			System.out.println("Stack full !");
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty !");
		}
		else
		{
			nElems--;
			theQueue.removeTop();
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack Empty !");
		}
		else
		{
			int t = theQueue.peekTop();
			System.out.println("Element at top:"+t);
		}
	}
	public boolean isEmpty()
	{
		if(nElems==0)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(nElems==maxSize)
			return true;
		else
			return false;
	}
	public void displayS()
	{
		theQueue.display();
	}
}

class StackQueueApp
{
	public static void main(String []Args)
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of stack:");
		int n=s.nextInt();
		Stackx theStack = new Stackx(n);	
		theStack.push(1);
		theStack.push(2);
		theStack.push(3);
		theStack.displayS();
		theStack.peek();
		theStack.pop();	
		theStack.displayS();
	}
}

