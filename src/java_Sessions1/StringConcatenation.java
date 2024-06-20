package java_Sessions1;

public class StringConcatenation {

	public static void main(String[] args)
	{
		String x = "Hello";
		String y = "World";
		System.out.println(x+y);
		
		int z = 100;
		System.out.println(z+x+y);
		int k = 300;
		System.out.println(k+z+x+y);
		System.out.println(x+y+(z+k));
	}
}
