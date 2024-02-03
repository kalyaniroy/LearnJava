package basicjavaprograme;

public class sibIIBConstructor 
{
	
	{
		System.out.println("This is SIB");
	}
	static
	{
		System.out.println("This is IIB");
	}
	
	sibIIBConstructor()
	{
		System.out.println("This is constructor");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method");
		new sibIIBConstructor();

	}

}
