package BasicJavaProgram;

public class LoopPattern {

	public static void main(stringPractice[] args) {
	
		for (int i=0; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
			 System.out.print("*");
			}
		 System.out.println();
		}

		System.out.println();
		
		for (int i=5; i>=0; i--)
		{
			for (int j=i; j>0; j--)
			{
				System.out.print("*");
			}
		 System.out.println();
	}
	}
}

