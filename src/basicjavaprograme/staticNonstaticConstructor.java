package basicjavaprograme;

public class staticNonstaticConstructor 
{
	public staticNonstaticConstructor() 
	
	{
		System.out.println("constructor method");
	}
	
	public static void sum(int a)
	{
			a=20;
		int b=30;
		System.out.println(a+b);
		
	}
	
	public void multi(int c, int d)
	{
		c=3;
		d=6;
		System.out.println(c*d);
	}

	public static void main(String[] args) 
	{
		
		staticNonstaticConstructor obj= new staticNonstaticConstructor();
		sum(1);
		obj.multi(1, 2);
		

	}

}
