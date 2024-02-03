package BasicJavaProgram;

public class stringPractice {

	public static void main(java.lang.String[] args) {
		//String is an object//String literal
		
		String s1= "Rahal Setty Academy";
		String s5= "hello";
		
		//String using new memory allocate operator
		String s2 = new String("welcome");
		String s3= new String("welcome");
		
		String s = "Rahal Setty Academy";
		System.out.println(s);
		String[] splittedstr= s.split("Setty");
		System.out.println(splittedstr[0]);
		System.out.println(splittedstr[1]);
		System.out.println(splittedstr[1].trim());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		

	}

}
