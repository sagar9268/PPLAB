import java.io.*;
class StackX
{
	private int maxSize;
	private char[] stackArray;
	private int top;
	public StackX(int s)
	{
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	public void push(char j)
	{
		stackArray[++top] = j;
	}
	public char pop()
	{
		return stackArray[top--];
	}
	public char peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);
	}
	public boolean isFull()
	{
		return (top == maxSize-1);
	}
}

class BracketChecker
{
	private String input;
	BracketChecker(String in)
	{
		input = in;
	}
	public void check()
	{
		int stackSize = input.length();
		StackX theStack = new StackX(stackSize);
		for(int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			switch(ch)
			{
				case '(':
				case '{':
				case '[':
					theStack.push(ch);
					break;
				case ')':
				case '}':
				case ']':
					if(!theStack.isEmpty())
					{
						char ch2 = theStack.pop();
						if( (ch == ')' && ch2 != '(') || (ch == '}' && ch2 != '{') || (ch == ']' && ch2 != '[') )
						{
							System.out.println("Error:"+ch+" at "+i);
						}
					}
					else
					{
						System.out.println("Error:"+ch+" at "+i);
					}
					break;
				default:
					break;
			}
		}
		if( !theStack.isEmpty() )
		{
			System.out.println("Error: Missing right delimeter!");		
		}
	}
}

class BracketsApp
{
	public static void main(String[] args) throws IOException
	{
		String input;
		while(true)
		{
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getString();
			if( input.equals("") )
				break;
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();
		}
		
	}
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
