package basicjavaprograme;

class grandfather
{
	static void method1()
	{
		System.out.println("M1");
	}
	void method2()
	{
		System.out.println("M2");
	}
}
class father extends grandfather
{
	static void method3 ()
	{
		System.out.println("M3");
	}
	void method4()
	{
		System.out.println("M4");
	}
	
}

public class multiLevelInhritance extends father

{
	static void method5()
	{
		System.out.println("M5");
	}
	void method6()
	{
		System.out.println("M6");
	}
	
	public static void main(String[] args) 
	{	
		multiLevelInhritance ob = new multiLevelInhritance();
		ob.method2();
		method1();
		method3();
		method5();
		ob.method4();
		ob.method6();

	}

}
