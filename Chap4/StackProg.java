import java.util.*;
class StackX
{
	private int maxSize;
	private long[] stackArray;
	private int top;
	public StackX(int s)
	{
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}
	public void push(long j)
	{
		stackArray[++top] = j;
	}
	public long pop()
	{
		return stackArray[top--];
	}
	public long peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == maxSize-1);
	}
}

class StackApp
{
	public static void main(String[] args)
	{
		StackX theStack = new StackX(10);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		System.out.println("Enter the elements:");
		int x;		
		for(int i=0;i<n;i++)
		{
			x = s.nextInt();
			theStack.push(x);
		}
		while( !theStack.isEmpty() )
		{
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
