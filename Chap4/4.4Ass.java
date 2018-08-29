class PriorityQ
{
	private int maxSize;
	private int[] queArray;
	private int nItems;
	public PriorityQ(int s)
	{
		maxSize = s;
		queArray = new int[maxSize];
		nItems = 0;
	}
	public void insert(int item)
	{
		if(isFull())
			return;
		else
			queArray[nItems++]=item;
		
	}
	public int remove()
	{
		if(nItems==0)
			return -1;
		else
		{ 
			int temp=queArray[0];
			int index=0;
			for(int i=1;i<nItems;i++)
			{
				if(queArray[i]<temp)
				{
					temp=queArray[i];
					index=i;
				}
			}
			queArray[index]=queArray[0];
			for(int i=0;i<(nItems-1);i++)
				queArray[i]=queArray[i+1];
			nItems--;
			return temp;
		}
	}
	public boolean isEmpty()
	{ 
		return (nItems==0); 
	}
	public boolean isFull()
	{ 
		return (nItems == maxSize); 
	}
}
class PriorityQApp
{
	public static void main(String[] args)
	{
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		int mno=thePQ.remove();
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		while( !thePQ.isEmpty() )
		{
			int item = thePQ.remove();
			System.out.print(item + " ");
		}
		System.out.println("");
	} 
}
