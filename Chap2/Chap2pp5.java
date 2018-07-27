class OrdArray
{
private long[] a;
private int nElems;
public OrdArray(int max)
{
	a = new long[max];
	nElems = 0;
}
public int size()
{ return nElems; }
public int find(long searchKey)
{
	int lowerBound = 0;
	int upperBound = nElems-1;
	int curIn;
	while(true)
	{
		curIn = (lowerBound + upperBound ) / 2;
		if(a[curIn]==searchKey)
			return curIn;
		else if(lowerBound > upperBound)
			return nElems;
		else
		{
			if(a[curIn] < searchKey)
				lowerBound = curIn + 1;
			else
				upperBound = curIn - 1;
		}
	}
}
public void insert(long value)
{
	int j;
	for(j=0; j<nElems; j++)
		if(a[j] > value)
			break;
	for(int k=nElems; k>j; k--)
		a[k] = a[k-1];
	a[j] = value;
	nElems++;
}
public boolean delete(long value)
{
	int j = find(value);
	if(j==nElems)
		return false;
	else
	{
		for(int k=j; k<nElems; k++)
			a[k] = a[k+1];
		nElems--;
		return true;
	}
}
public void display()
{
	for(int j=0; j<nElems; j++)
		System.out.print(a[j] + " ");
	System.out.println("");
}
public long getElems(int i)
{
	return a[i];
}
public void merge(OrdArray arr1, OrdArray arr2, OrdArray arr3)
{
	for(int i=0;i<arr1.size();i++)
		{
			arr3.insert(arr1.getElems(i));
		}
		for(int i=0;i<arr2.size();i++)
		{
			arr3.insert(arr2.getElems(i));
		}
}
}
class OrderedApp
{
	public static void main(String[] args)
	{
		int maxSize = 100;
		OrdArray arr1,arr2,arr3;
		arr1 = new OrdArray(maxSize);
		arr2 = new OrdArray(maxSize);
		arr3 = new OrdArray(maxSize);
		arr1.insert(77);
		arr1.insert(99);
		arr1.insert(44);
		arr1.insert(55);
		arr1.insert(22);
		arr2.insert(88);
		arr2.insert(11);
		arr2.insert(00);
		arr2.insert(66);
		arr2.insert(33);
		arr1.display();
		arr2.display();
		arr3.merge(arr1,arr2,arr3);
		arr3.display();
		
	}
}
