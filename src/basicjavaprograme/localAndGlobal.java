package basicjavaprograme;

public class localAndGlobal 
{
	 int age;
	   String name;
	   double salary;
	   
	   void student(int age,String name,double salary)
	   {
		   System.out.println("remember i am non static");
	   }
		public static void main(String[] args)
		{
			localAndGlobal L1=new localAndGlobal();
			L1.student(99,"phaneendra", 3.12);
			
			System.out.println(L1.age);
			System.out.println(L1.name);
			System.out.println(L1.salary);
				
			}


}
