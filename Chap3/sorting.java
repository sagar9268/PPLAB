import java.util.*;
class sorting
{
public static void main(String args[])
{
chapter3 obj=new chapter3();
System.out.println("\nBASIC BUBBLE SORT");
obj.insert();
obj.bubblesort();
obj.median();
obj.display();
System.out.println("\nBI-DIRECTIONAL BUBBLE SORT");
obj.insert();
obj.bi_sort();
obj.median();
obj.display();
System.out.println("\nODD EVEN BUBBLE SORT");
obj.insert();
obj.odd_even();
obj.median();
obj.display();
System.out.println("\nINSERTION SORT");
obj.insert();
obj.insertion_sort();
obj.median();
obj.display();
System.out.println("\nSELECTION SORT");
obj.insert();
obj.selection_sort();
obj.median();
obj.display();
System.out.println("\ncounting count and comparisons");
obj.insert();
obj.insertion();
System.out.println("\nRemoving duplicate : using i,j");
obj.insert();
obj.insertion_sort();
obj.noDups();
obj.median();
System.out.println("\nRemoving duplicate : deleting -1 for same ");
obj.insert();
obj.remove_dups();


}
}

class chapter3
{
int a[];
int n,i,j;
chapter3()
{
a=new int[100];
n=0;
}
public void insert()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
n=sc.nextInt();
System.out.println("enter n values");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
}
 //normal bubble sort
public void bubblesort()
{
for(i=n-1;i>0;i--)
{
for(j=0;j<i;j++)
{
if(a[j]>a[j+1])
swap(j,j+1);
}
}
}

// 3.1 : bidirectional bubble sort
public void bi_sort()
{
int low=0;
int high=n-1;
int flag=1;
while(low<high)
{
for(j=low;j<high-1;j++)
{
if(a[j]>a[j+1])
{swap(j,j+1); flag=0;}
}
for(j=high;j>low;j--)
{
if(a[j]<a[j-1])
{swap(j,j-1); flag=0;}
}
high--;
low++;
if (flag!=0)
break;
}

}

// 3.4 : odd even sort
public void odd_even()
{
int k;
for(i=n-1;i>1;i--)
{
for(j=1;j<n-1;j=j+2)
{
if(a[j]>a[j+1])
swap(j,j+1);
}
for(k=0;k<n-1;k=k+2)
{
if(a[k]>a[k+1])
swap(k,k+1);
}
}
}

//insertion sort
public void insertion_sort()
{
int t=0;int k;
for (i=1; i<n; ++i)
{
k=a[i];
j = i-1;
while (j>=0 && a[j] > k)
{
a[j+1] = a[j];
j = j-1;
}
a[j+1] = k;
}

}

// 3.5 : to count the copy and comparison
public void insertion()
{
int comp=1,copy=0;
int t=0;int k;
for (i=1; i<n; ++i)
{
k=a[i];
j = i-1;
while(j>=0)
{
comp++;
if(a[j]>k)
{
copy++;
a[j+1] = a[j];
}
j = j-1;
}
a[j+1] = k;
copy++;
}

System.out.println("copy : "+copy+"  comparison : "+comp);
}

//selection sort
public void selection_sort()
{
int min=0;
for(i=0;i<n-1;i++)
{
min=i;
for(j=i+1;j<n;j++)
{
if(a[j]<a[min])
min=j;
}
swap(i,min);
}
}

//swapping 2 numbers
private void swap(int x,int y)
{
int t=a[x];
a[x]=a[y];
a[y]=t;
}

// 3.2 : median of the array
public void median()
{
double x;
if(n%2==1)
System.out.print("Median value : "+a[n/2]);
else
{
x=a[n/2]+a[(n/2)-1];
System.out.print("Median value : "+x/2);
}

System.out.println();
}

// 3.3 : removing duplicates
public void noDups()
{
int k=0;
for(i=0;i<n-1;i++)
{
if(a[i]!=a[i+1])
{a[k]=a[i];k++;}
}
a[k++]=a[n-1];

for(i=0;i<k;i++)
System.out.print(a[i]+" ");
System.out.println();
}

// 3.6 : removing duplicates using -1 for same element
public void remove_dups()
{
int c=0;
for(i=0;i<n;i++)
{
if(a[i]!=-1)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
a[j]=-1;
c++;
}
}
}
}
selection_sort();
display();
for(i=c;i<n;i++)
System.out.print(a[i]+" ");
}


public void display()
{
System.out.println("\nOUTPUT :	");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
System.out.println("\n");
}
}









































