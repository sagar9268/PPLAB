import java.util.*;
class Array
{
	int x[];
	int nElems;
	Array(int n)
	{
		x = new int[n];
		nElems = n;
	}
	public void oddEvenSort()
	{
		for(int i=0;i<nElems/2;i++)
		{
			//for odd
			for(int j=0;j<nElems-1;j=j+2)
			{
				if(x[j]>x[j+1])
				{
					swap(j,j+1);
				}
			}
			//for even
			for(int j=1;j<nElems-1;j=j+2)
			{
				if(x[j]>x[j+1])
				{
					swap(j,j+1);
				}
			}
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
		for(int i=0;i<nElems;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("");		
	}
}
class OddEvenSort
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr number of elements:");
		int n = s.nextInt();
		Array arr = new Array(n);
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr.x[i] = s.nextInt();
		}
		arr.display();
		arr.oddEvenSort();
		arr.display();	
	}
}

