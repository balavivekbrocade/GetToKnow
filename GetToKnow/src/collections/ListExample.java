package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> lis = new ArrayList<String>();

		lis.add("vivek");
		lis.add("bala");

		for (String string : lis) {
			System.out.println("String : : " + string);
		}
	}

}
