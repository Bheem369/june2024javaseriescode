package java_Sessions1;

public class staticVariable {

	String name;
	int price;
	String color;
	static int wheels = 4;
	
	public static void speedTest()
	{
		
	}

	
	public static void main(String[] args)
	{
		staticVariable c1 = new staticVariable();
		c1.name = "BMW";
		c1.price = 80;
		c1.color="black";
		
		staticVariable c2 = new staticVariable();
		c2.name = "AUDI";
		c2.price = 90;
		c2.color = "red";
		
		System.out.println(c1.name + c1.price + c1.color + wheels);		
		System.out.println(c2.name + c2.price + c2.color + staticVariable.wheels);
	}
	
}
