package basicjavapractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String i = "Kalyani";
		String j = "";
	
		
		 
		for(int k=0; k<i.length(); k++)
			
		{	
			j= i.charAt(k)+j;
		
		}
		System.out.print(j);
	
	}

}
