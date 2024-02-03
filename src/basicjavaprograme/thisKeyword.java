package basicjavaprograme;

public class thisKeyword 
{ 		
	thisKeyword()
	{
		System.out.println("My first constructor");
	}
	thisKeyword(int a)
	{	
		this();
		System.out.println("My second constructor");	
	}
	thisKeyword(int a, int b)
	{	
		this(3);
		System.out.println("My third constructor");
	}
	thisKeyword(double a, int b)
	{	this(3, 5);
		System.out.println("My forth constructor");
	}
	thisKeyword(double a, int b, char c)
	{
		this(23.456, 4);
		System.out.println("My fifth constructor");
	}

	public static void main(String[] args) 
	{
			new thisKeyword(23.456, 4, 'd');
	}

}
