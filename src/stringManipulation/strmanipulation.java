package stringManipulation;

public class strmanipulation {
	
	public static void main(String[] args)
	{
		String str = "hi this is my java code and i am so happy";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(8));
		
		System.out.println(str.indexOf('j'));
		
		System.out.println(str.indexOf('h', str.indexOf('h')+1 ));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.trim());
		
		System.out.println(str.replace(" ", ""));
		
		System.out.println(str.equalsIgnoreCase(str.toUpperCase()));
		
		
	}

}