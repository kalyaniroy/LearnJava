package basicjavaprograme;

public class localVariableGlobalVariable 
{
	static int a=100;
	String b = "50";
	boolean c;
	
	void addition()
	{
		int age=100;
		
		
		System.out.println(a+b);
		
	}
	
	

	public static void main(String[] args)
	{
		localVariableGlobalVariable ob = new localVariableGlobalVariable ();
		ob.addition();
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(a);
		

	}

}
