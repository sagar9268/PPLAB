import java.io.*;
class Queue
{
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	public int nElems;

	public Queue(int max)
	{
		maxSize=max;
		queArray=new int[maxSize];
		front=-1;
		rear=-1;
		nElems=0;
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
		nElems++;
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
		nElems--;
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
	public static void main(String[] args)throws IOException
	{
		BufferedReader nn=new BufferedReader(new InputStreamReader(System.in));
		Queue theQueue[]=new Queue[3];
		theQueue[0]=new Queue(15);
		theQueue[1]=new Queue(15);
		theQueue[2]=new Queue(15);
		System.out.println("Enter your id:-");
		int id=Integer.parseInt(nn.readLine());
		System.out.println("Number of person present in the queues:-\nqueue 1- "+theQueue[0].nElems+"\nqueue 2- "+theQueue[1].nElems+"\nqueue 3- "+theQueue[2].nElems+"\nEnter your choice:-\n1 ->Queue 1\n2 ->Queue 2\n3-> Queue 3\n4 ->Random\n");
		int choice=Integer.parseInt(nn.readLine());
		switch(choice)
		{
			case 1:
				theQueue[0].insert(id);
				break;
			case 2:
                                theQueue[1].insert(id);
                                break;
			case 3:
                                theQueue[2].insert(id);
                                break;
			case 4:
				if((theQueue[0].nElems<theQueue[1].nElems)&&(theQueue[0].nElems<theQueue[2].nElems))
                                	theQueue[0].insert(id);
				else if((theQueue[1].nElems<theQueue[0].nElems)&&(theQueue[1].nElems<theQueue[2].nElems))
					theQueue[1].insert(id);
				else if((theQueue[2].nElems<theQueue[0].nElems)&&(theQueue[2].nElems<theQueue[1].nElems))
                                        theQueue[2].insert(id);
				else 
					theQueue[2].insert(id);
                                break;
			default:
				System.out.println("Wrong input plz enter the choices mentioned.\n");
		}		
		
		while(!theQueue.isEmpty())
		{
			int n=theQueue.remove();
			System.out.print(n);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
