package basicjavapractice;

public class MonAssign
{
	public static void name()
	{
		String a= "ram";
		String b= "rahim";
		String print= a+b;
		System.out.println(print);
	}
	
	public void girlname()
	{
		String a= "sita";
		String b= "rajiya";
		String print= a+b;
		System.out.println(print);
		
	}
	MonAssign()
	{
		int a= 22;
		int b= 42;
		int c= a+b;
		System.out.println(c);
		
	}
	public void babyname()
	{
		String a= "avani";
		String b= "vani";
		String print= a+b;
		System.out.println(print);
		
	}
	
	public static void main(String[] args) 
	{
		name();
		MonAssign ob= new MonAssign();
		ob.girlname();
		ob.babyname();
			
	}

}


//new class-3 diff method, static, n.static,constructor- call 3 in main method