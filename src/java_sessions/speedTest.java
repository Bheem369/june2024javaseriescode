package java_sessions;

public class speedTest {
	public static void main(String[] args)
	{
		Car c1 = new Car("BMW", 70);
		Car c2= new Car("AUDI","black",60,true);
		 System.out.println(c1.name);
			System.out.println(c1.price);	
			System.out.println(c2.name);
			System.out.println(c2.price);
			System.out.println(c2.color);
			System.out.println(c2.isAutomatic);
	}

}
