package HashmapConcept;

import java.util.HashMap;

public class HMC {

	public static void main(String[] args) {
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		
		empMap.put("Naveen", "SDET");
		empMap.put("Rashmi", "SDET1");
		empMap.put("Amrita", "SDET2");
		
		System.out.println(empMap);
		System.out.println(empMap.get("Amrita"));
 
	}

}
