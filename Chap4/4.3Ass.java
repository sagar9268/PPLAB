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
class Stack
{
	DeQueue mno;
	private int top;
	private int maxSizeStack;
	public Stack(int n)
	{
		maxSizeStack=n;
		mno= new DeQueue(maxSizeStack);
		top=-1;
	}
	public void push(int j)
	{
		top++;
		mno.insertRear(j);
	}
	public long pop()
	{
		top--;
		return mno.removeRear();	
	}
	public boolean isEmptyStack()
	{
		return (mno.isEmpty());
	}
	public boolean isFullStack()
	{
		return ( mno.isFullRear());
	}
}	

class QueueApp
{
	public static void main(String[] args)
	{
		Stack theStack=new Stack(10);
		theStack.push(20);
		theStack.push(40);
		theStack.pop();
		theStack.push(60);
		theStack.push(80);
		while(!theStack.isEmptyStack())
		{
			long value=theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
