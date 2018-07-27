import java.util.*;
class Output
{
	public static void main(String[] args)
	{
		Input varClass = new Input();
		varClass.varInput();
		varClass.varOutput();
	}
}
class Input
{
	int x;
	Input()
	{
		x=0;
	}
	void varInput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = s.nextInt();
		s.close();
	}
	void varOutput()
	{
		System.out.println("Entered number:"+x);
	}
}
