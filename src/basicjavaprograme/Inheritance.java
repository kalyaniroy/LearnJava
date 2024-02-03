package basicjavaprograme;

class parent
{
	static void method()
	{
		System.out.println("method 1");
	}
	void method2()
	{
		System.out.println("method 2");
	}
	
	parent()
	{
		System.out.println("Constructor");
	}
	
}

public class Inheritance extends parent
{
	static void method3()
	{
		System.out.println("method 3");
	}
	void method4()
	{
		System.out.println("method 4");
	}
	
	public static void main(String[] args)
{
		Inheritance ob= new Inheritance();
		ob.method2();
		ob.method4();
		method();
		method3();

}

}
