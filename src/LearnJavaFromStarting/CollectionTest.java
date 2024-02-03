package LearnJavaFromStarting;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kalyani");
		list.add("Kalyan12");
		list.add("Kalyan3");
		list.add("Kalyan4");
		list.add("Kalyan5");
		list.add("Kalyan6");
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i));
		}
		
		System.out.println(list.get(4));
	}
	

}
