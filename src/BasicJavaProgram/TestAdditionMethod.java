package BasicJavaProgram;

public class TestAdditionMethod {
	
	stringPractice name = "kalyani";
	
	int addtion(int num1,int num2) {
		int sum = num1+num2;
		//System.out.println(name);
		substraction(10,10);
		return sum;
	}
	
	int substraction(int num1,int num2) {
		int sum = num1-num2;
		System.out.println(sum);
		return sum;
	}
	
	public static void main(stringPractice[] args) {
		int a=10;
		int b=10;
		TestAdditionMethod test = new TestAdditionMethod(); //creating a object with name test
		
		//we will use obj in main method to call function.
		
		int addition= test.addtion(a, b);
		int sub = test.substraction(a,b); //calling function via object 
		
		System.out.println(addition);
		System.out.println(sub);
		
		//System.out.println(test.addtion(a, b));
	}
	
	

}
