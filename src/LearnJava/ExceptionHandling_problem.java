package LearnJava;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_problem
{

	public void getdata()
	{
		System.out.println("Hello get data");
	}
	public void getdata1()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the input");
			int c = sc.nextInt();
			System.out.println(c);
		}
		
		catch (ArithmeticException e) {
			getdata();
		}
		catch (InputMismatchException e) {
			getdata2();
		}
		catch (Exception e) {
			System.out.println("issue in get data1 method "+e);
		}
	}
	public void getdata2()
	{
		System.out.println("hello getdata2");
	}
	public static void main(String[] args) 
	{
		ExceptionHandling_problem ob = new ExceptionHandling_problem();
	//ob.getdata();
		//ob.getdata1();
		ob.getdata2();
	}
}