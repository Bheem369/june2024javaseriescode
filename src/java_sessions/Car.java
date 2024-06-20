package java_sessions;

public class Car {

	String name;
	String color;
	int price;
	boolean isAutomatic;
	
	public Car(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	
	public Car(String name, String color, int price, boolean isAutomatic)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.isAutomatic = isAutomatic;
	}
}
