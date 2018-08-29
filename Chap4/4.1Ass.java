class Queue
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;

	public Queue(int max)
	{
		maxSize=max;
		queArray=new int[maxSize];
		front=-1;
		rear=-1;
	}

	public boolean isEmpty()
	{
		return (rear==-1);
	}

	public boolean isFull()
	{
		return (front==(rear+1)%maxSize);
	}

	public void insert(int j)
	{
		if(isFull())
			System.out.println("Overflow of Queue");
		else if(isEmpty())
		{
			rear++;
			front++;
		}
		else
			rear=(rear+1)%maxSize;
		queArray[rear]=j;
	}

	public int remove()
	{
		int temp=queArray[front];
		if(isEmpty())
		{
			System.out.println("Underflow of Queue.");
			return -1;
		}
		else if(front==rear)
		{
			rear=-1;
			front=-1;
		}
		else
			front=(front+1)%maxSize;
		return temp;
	}

	public void display()
	{
		int i;
		if(front>rear)
		{
			for(i=front;i<=maxSize-1;i++)
				System.out.print(queArray[i]+" ");
			for(i=0;i<=rear;i++)
				System.out.print(queArray[i]+" ");
			System.out.println();
		}
		else
		{
			for(i=front;i<=rear;i++)
				System.out.print(queArray[i]+" ");
			System.out.println();
		}
	}
}	

class QueueApp
{
	public static void main(String[] args)
	{
		Queue theQueue=new Queue(6);
		theQueue.insert(10);
		theQueue.insert(20);
		theQueue.insert(30);
		theQueue.insert(40);
		theQueue.insert(50);

		theQueue.display();

		theQueue.remove();
		theQueue.remove();

		theQueue.insert(60);
		theQueue.insert(70);
		theQueue.insert(80);
		
		while(!theQueue.isEmpty())
		{
			int n=theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
