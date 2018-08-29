class DeQueue
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;

	public DeQueue(int max)
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
	public boolean isFullFront()
        {
                return (front==0);
        }

	public boolean isFullRear()
	{
		return (rear==(maxSize-1));
	}

	public void insertRear(int j)
	{
		if(isFullRear())
		{
			System.out.println("Overflow of Queue");
			return;
		}
		else if(isEmpty())
		{
			rear++;
			front++;
		}
		else
			rear++;
		queArray[rear]=j;
	}
	public void insertFront(int j)
        {
                if(isFullFront())
                {
                        System.out.println("Overflow of Queue");
                        return;
                }
                else if(isEmpty())
                {
                        rear++;
                        front++;
                }
                else
                        front--;
                queArray[front]=j;
        }

	public int removeFront()
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
			front++;
		return temp;
	}
	public int removeRear()
        {
                int temp=queArray[rear];
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
                        rear--;
                return temp;
        }

	public void display()
	{
		for(int i=front;i<=rear;i++)
			System.out.print(queArray[i]+" ");
		System.out.println();
	}
}	

class QueueApp
{
	public static void main(String[] args)
	{
		DeQueue theQueue=new DeQueue(10);
		theQueue.insertRear(10);
		theQueue.insertRear(20);
		theQueue.insertRear(30);
		theQueue.insertFront(40);
		theQueue.insertFront(50);

		theQueue.display();

		theQueue.removeFront();
		theQueue.display();
		theQueue.removeRear();
		theQueue.display();
		theQueue.insertFront(60);
		theQueue.insertRear(70);
		theQueue.insertFront(80);
		theQueue.display();
		while(!theQueue.isEmpty())
		{
			int n=theQueue.removeFront();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
