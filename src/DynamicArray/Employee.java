package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Tom");
		nameList.add("Peter");
		nameList.add("Rashmi");
		nameList.add("Naveen");
		nameList.add("Ravi");
		
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		
		for(String e : nameList)
		{
			System.out.println(e);
		}
		
		List<String> browserList = Arrays.asList("chrome", "firefox", "IE", "Safari", "Edge");
		System.out.println(browserList.size());
		System.out.println(browserList);
		
	}

}
