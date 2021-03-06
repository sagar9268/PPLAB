import java.util.*;
import java.text.SimpleDateFormat;
class Person
{
	private String firstName,lastName;
	private int age;
	Person(String first, String last, int a)
	{
		firstName = first;
		lastName = last;
		age = a;
	}
	String getLast()
	{
		return lastName;
	}
	void displayPerson()
	{
		System.out.print(" Last Name: "+lastName);
		System.out.print(" , First Name: "+firstName);
		System.out.println(" , Age: "+age);
	}
}
class ArrayOb
{
	private Person p[];
	private int nElems;
	ArrayOb(int max)
	{
		p = new Person[max];
		nElems = 0;
	}
	void insert(String first, String last, int a)
	{
		p[nElems] = new Person(first, last, a);
		nElems++;
	}
	void display()
	{
		for(int i=0;i<nElems;i++)
		{
			p[i].displayPerson();
		}
		System.out.println("");
	}
	void insertionSort()
	{
		int i,j;
		for(i=1;i<nElems;i++)
		{
			Person temp = p[i];
			j = i;
			while(j>0 && p[j-1].getLast().compareTo(temp.getLast())>0)
			{
				p[j] = p[j-1];
				j--;
			}
			p[j] = temp;
		}
	}
}
class ObjectSortApp
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of persons:");
		int n = s.nextInt();
		String f,l;
		int a;
		ArrayOb arr = new ArrayOb(n);
		for(int i=0;i<n;i++)
		{
			System.out.println("First Name:");
			f = s.next();
			System.out.println("Last Name:");
			l = s.next();
			System.out.println("Age:");
			a = s.nextInt();
			arr.insert(f,l,a);
		}
		System.out.println("Before Sort:");
		arr.display();
		arr.insertionSort();
		System.out.println("After Sort:");
		arr.display();	
		//printing date and time
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
 		Date date = new Date();  
    		System.out.println(formatter.format(date));  
    		//or
    		System.out.println(java.time.LocalDateTime.now());
    		//or  
    		Date date1=java.util.Calendar.getInstance().getTime();  
		System.out.println(date1);  
	} 
}
