import java.util.*;
class Array
{
	int x[];
	Array()
	{
		x = new int[10];
	}
	public void bubbleSort()
	{
		int i,j,k,out,in;
		out = 10;
		in = 0;
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<out;j++)
			{
				if(x[i]>x[j])
				{
					swap(i,j);
				}
			}
			out--;
			for(k=j-2;k>in;k--)
			{
				if(x[k]>x[j-1])
				{
					swap(k,j-1);
				}
			}
			in++;
		}
	}
	public void swap(int i,int j)
	{	
		x[i]=x[i] + x[j];
		x[j]=x[i] - x[j];
		x[i]=x[i] - x[j];
	}
	public void display()
	{	
		for(int i=0;i<10;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("");		
	}
}
class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Array arr = new Array();
		System.out.println("Enter 10 elements:");
		for(int i=0;i<10;i++)
		{
			arr.x[i] = s.nextInt();
		}
		arr.bubbleSort();
		arr.display();		
	}
}

