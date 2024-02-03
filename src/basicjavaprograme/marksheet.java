package basicjavaprograme;

import java.util.Scanner;

public class marksheet {

	
	int total;
	float percentage;

	
	public void getDetails(String name,String father_name,String college_name,Long roll_no,int hindi_marks,int science_marks,int english_marks,int computer_marks,int math_marks) 
	{
		System.out.println("***Marksheet***");
		System.out.println("Student name is: "+name);
		System.out.println("Student father name is: "+father_name);
		System.out.println("Student college name is:"+college_name);
		System.out.println("Student roll_no is: "+roll_no);
		System.out.println("Student hindi_marks is: "+hindi_marks);
		System.out.println("Student science_marks is: "+science_marks);
		System.out.println("Student english_marks is: "+english_marks );
		System.out.println("Student computer_marks is: "+computer_marks);
		System.out.println("Student math_marks is: "+math_marks);
total=hindi_marks+science_marks+english_marks+computer_marks+math_marks;
		
		percentage=(total*100)/500;
		System.out.println("Total marks is "+ total);
		System.out.println("Student percentage(%) is: "+percentage);
	
		
	}

	public static void main(String[] args) {
	
		marksheet ob =new marksheet();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the name");
		String name = sc.next();
		System.out.println("Please enter the father_name");
		String father_name = sc.next();
		System.out.println("Please enter the college_name");
		String college_name = sc.next();
		System.out.println("Please enter the roll_name");
		Long roll_no = sc.nextLong();
		System.out.println("Please enter hindi_marks");
		int hindi_marks=sc.nextInt();
		System.out.println("Please enter science_marks");
		int science_marks=sc.nextInt();
		System.out.println("Please enter english_marks");
		int english_marks=sc.nextInt();
		System.out.println("Please enter computer_marks");
		int computer_marks=sc.nextInt();
		System.out.println("Please enter math_marks");
		int math_marks=sc.nextInt();
		ob.getDetails(name, father_name, college_name, roll_no,hindi_marks,science_marks,english_marks,computer_marks,math_marks);


	}

}
