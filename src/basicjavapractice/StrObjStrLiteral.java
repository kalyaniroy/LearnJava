package basicjavapractice;

public class StrObjStrLiteral {

	public static void main(String[] args) {
		
		String a= "java";
		String b= "java";
		System.out.println(a==b);  //True
		
		String c= new String ("java");
		String d= new String ("java");
		System.out.println(c==d);  //False
		
		String e= "java";
		String f= new String ("java");
		System.out.println(e==f); //False
		System.out.println(e.equals(f)); //True
							
	}

}
