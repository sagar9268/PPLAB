import java.util.*;
class FactorialApp
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		long facto = fact(n);
		System.out.println("Factorial:"+facto);
	}
	public static long fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}
