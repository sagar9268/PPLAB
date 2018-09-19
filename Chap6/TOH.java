import java.util.*;
class TOHApp
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of disks:");
		int nDisks  = s.nextInt();
		doTowers(nDisks,'A','B','C');
	}
	public static void doTowers(int n, char s, char i, char d)
	{
		if(n==1)
			System.out.println("Disk 1 from "+s+" to "+d);
		else
		{
			doTowers(n-1,s,d,i);
			System.out.println("Disk "+n+" from "+s+" to "+d);
			doTowers(n-1,i,s,d);
		}
			
	}
}
