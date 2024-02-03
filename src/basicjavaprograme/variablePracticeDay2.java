package basicjavaprograme;

public class variablePracticeDay2 
{
						//call non static G.V
			static int age=100;
			String name="phaneendra";  //non static G.V
			void add()
			{
				 age = 90;
				 System.out.println(age);
			}

			public static void main(String[] args) 
			{
				System.out.println(age);
				
				variablePracticeDay2 obj = new variablePracticeDay2 ();
				obj.add();
				System.out.println(obj.name);
		      
			}

		

	}

