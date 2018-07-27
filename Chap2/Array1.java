import java.util.*;
class LowArray
{
	private long a[];
	LowArray(int max)
	{
		a = new long[max];
	}
	void setElem(int index, long value)
	{
		a[index] = value;
	}
	long getElem(int index)
	{
		return a[index];
	}
}

class LowArrayApp
{
	public static void main(String []args)
	{
		LowArray arr = new LowArray(100);
		int nElems = 0;
		int j;
		arr.setElem(0,33);
		arr.setElem(1,77);
		arr.setElem(2,99);
		arr.setElem(3,44);
		arr.setElem(4,55);
		arr.setElem(5,22);
		arr.setElem(6,88);
		arr.setElem(7,11);
		arr.setElem(8,00);
		arr.setElem(9,66);
		nElems = 10;
		//display
		for(j=0;j<nElems;j++)
		{
			System.out.print(arr.getElem(j)+" ");
		}
		//search
		int searchKey  = 96;
		for(j=0;j<nElems;j++)
		{
			if(arr.getElem(j) == searchKey)
				break;
		}
		if(j == nElems)
		{
			System.out.println("Can't find "+searchKey);
		}
		else
		{
			System.out.println("Found "+searchKey);
		}
		//delete
		for(j=0; j<nElems; j++)
		{
			if(arr.getElem(j) == 55)
			break;
		}
		for(int k=j; k<nElems; k++)
		{
			arr.setElem(k,arr.getElem(k+1));
		}
		nElems--;
		//display
		for(j=0;j<nElems;j++)
		{
			System.out.print(arr.getElem(j)+" ");
		}
	}
}
