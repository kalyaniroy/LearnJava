package basicjavapractice;

public class Practice {

	public static void main(String[] args) {
		
		String a = "fly me to the moon";
		
		int pos1 = a.indexOf(' ');
		int pos2 = a.lastIndexOf(' ');
		
		String f_word = a.substring(0,pos1);
		String l_word = a.substring (pos2+1);
		
		System.out.println("First word is :"+f_word);
		
		System.out.println("Last word is :"+l_word);
		System.out.println(f_word.length());
		System.out.println(l_word.length());
		
		
		
		
			

	}

}
