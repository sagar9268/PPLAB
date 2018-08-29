class DCirque
{
	private int maxSize;
	private int a[];
	private int front;
	private int rear;

	public DCirque(int max)
	{
		maxSize= max;
		a = new int[maxSize];
		front = -1;
		rear = -1;
	}

	public void insertRight(int s)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(rear == -1)
			{
				front = 0;
				rear = 0;
				a[rear]=s;
			}
			else
			{
				rear=(rear+1)%maxSize;
				a[rear]=s;
			}
		}	
	}


	public void insertLeft(int s)
       	{
		 if (isFull()) 
		{
			System.out.println("Queue is full");
		}
		else
		{	    
		 if (front == 0)         
			 front = maxSize;
               	     a[--front] = s;         
		}                       
	}

	public boolean isFull()
	{
		if((front==0 && rear== maxSize-1)||(front==(rear+1)%maxSize))
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
	public void removeLeft()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
			front=(front+1)%maxSize;
	}


     public void  removeRight()
     {
         if (isEmpty())
         	System.out.println("Queue is empty");

        rear--;
        if (rear < 0)
            rear= maxSize - 1;   
    }
	public void display()
	{
		int i= front;
		while(i<=rear)
		{
			System.out.print(a[i]+" ");
			System.out.println("");
			i=(i+1)%maxSize;
		}
		System.out.println("");
	}
}
class dqueue
{
	public static void main(String []Args)
	{
		DCirque theQueue = new DCirque(5);

                theQueue.insertRight(10);
                theQueue.insertRight(20);
                theQueue.insertRight(30);
                theQueue.insertRight(40);
		theQueue.display();

                theQueue.removeLeft();
                theQueue.removeLeft();
                theQueue.removeLeft();
		theQueue.display();

                theQueue.insertLeft(50);
                theQueue.insertLeft(60);
		theQueue.display();

                theQueue.removeRight();
                theQueue.removeRight();
		theQueue.display();
	}
}

