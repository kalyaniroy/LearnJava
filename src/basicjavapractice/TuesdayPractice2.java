package basicjavapractice;

public class TuesdayPractice2 {
	
	public void sum(boolean s)
	{
		int a= 2;
		int b= 12;
		System.out.println(a+b);
		
	}
	public void sub()
	{
		int a= 22;
		int b= 12;
		System.out.println(a-b);
		
	}
	public void multi(int c)
	{
		int a= 4;
		int b= 10;
		System.out.println(a*b);
		
	}
	public void div()
	{
		int a= 200;
		int b= 12;
		System.out.println(a/b);
			
	}

	public static void sum()
	{
		
		System.out.println("TRUE");	
	}
	
	
	public static void main(String[] args) {
		
		TuesdayPractice2 ob = new TuesdayPractice2();
		ob.sum(false);
		ob.multi(5);
		ob.sub();
		ob.div();
		ob.sum();
		

	}

}
