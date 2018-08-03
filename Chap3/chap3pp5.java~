import java.util.*;
class Array
{
	int x[];
	int nElems;
	int nCompare=0;
	int nCopies=0;
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
			while(j>0)
			{	
				nCompare++;
				if(x[j-1]>=temp)
				{
					nCopies++;
					x[j] = x[j-1];
					j--;
				}
				else
					break;
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
		System.out.println("Number of Copies:"+nCopies+"\n");
		System.out.println("Number of Comparisons:"+nCompare+"\n");
		
		
		
				
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
		arr.insertionSort();
		arr.display();	
	}
}

