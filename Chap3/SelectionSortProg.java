import java.util.*;
class Array
{
	int x[];
	int min;
	Array()
	{
		x = new int[10];
	}
	public void selectionSort()
	{
		for(int i=0;i<9;i++)
		{
			min = i;
			for(int j=i+1;j<10;j++)
			{
				if(x[min]>x[j])
				{
					min = j;
				}
			}
			swap(i,min);
		}
	}
	public void swap(int i,int j)
	{	
		int t;
		t = x[i];
		x[i] = x[j];
		x[j] = t;
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
class SelectionSort
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
		arr.display();
		arr.selectionSort();
		arr.display();		
	}
}

