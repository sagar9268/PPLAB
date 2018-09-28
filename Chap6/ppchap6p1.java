import java.util.*;

class q6_1
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 nos:");
		int x,y,z;
		x=sc.nextInt();
		y=sc.nextInt();
		z=mult(x,y);
		System.out.println(x+" * "+y+" = "+z);
	}
	
	public static int mult(int x, int y)
	{
		if(x<y)
			return mult(y,x);
		else if(y>0)
			return (x + mult(x,y-1));
		else
			return 0;
	}
}	
