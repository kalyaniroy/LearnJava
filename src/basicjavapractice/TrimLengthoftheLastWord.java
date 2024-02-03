package basicjavapractice;

public class TrimLengthoftheLastWord {

	public static void main(String[] args) {
		String str = "fly me to the moon";
		str= str.trim();
		int length = 0;
		
		for (int i= str.length() - 1; i>=0; i-- )
		{
			if (str.charAt(i)==' ')
			{
				break;
			}
			else
			{
			length++;	
			}
		}
		
		System.out.println("Length of last word is "+ length);
	}

}
