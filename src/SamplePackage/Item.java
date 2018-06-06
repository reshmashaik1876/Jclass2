package SamplePackage;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Item {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("name");
		list.add("Age");
		list.add("cat");
		list.add("Resh");
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
	}
}
