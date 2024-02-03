package basicjavapractice;



public class PracticeCostructor
{	
	PracticeCostructor() // It is not mandatory to give parameter in construtor
	{
		int a= 20;
		int b= 85;
		int c1= a+b;
		System.out.println(c1);
				
	}
	
	 PracticeCostructor(int r, int t) //In Construtor overloading parameter is mandatory
	{
		int a= 20;
		int b= 35;
		int c1= a+b;
		System.out.println(c1);
				
	}
	 
	 PracticeCostructor(String o)
		{
			String name= "raja";
			String name1= "chotu";
			System.out.println(name+name1);
					
		}
	
	public static void main(String[] args) 
{
		//PracticeCostructor ob = new PracticeCostructor(15,10);
		
		 //new PracticeCostructor();
		 //new PracticeCostructor(7,8);
		 new PracticeCostructor("tom");
}

}
