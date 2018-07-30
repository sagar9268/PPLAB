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
	public void insertionSort()
	{
		int j;
		for(int i=1;i<nElems;i++)
		{
			int temp = x[i];
			j = i;
			while(j>0 && x[j-1] >= temp)
			{
				x[j] = x[j-1];
				j--;
			}
			x[j] = temp;
		}
	}
	public void display()
	{	
		for(int i=0;i<nElems;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("");		
	}
	public void median()
	{
		int n = nElems/2;
		double med;
		if(nElems%2 == 0)
		{
			med = (x[n]+x[n-1])/2.0;
		}
		else
		{
			med = x[n];
		}
		System.out.println(med);
	}
}
class InsertionSort
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		Array arr = new Array(n);
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr.x[i] = s.nextInt();
		}
		arr.display();
		arr.insertionSort();
		arr.display();	
		arr.median();	
	}
}

