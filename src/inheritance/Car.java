package inheritance;

public class Car {

	public void start()
	{
		System.out.println("Car ----Start");
	}
	
	public void stop()
	{
		System.out.println("Car---Stop");
	}
	
	public void refuel()
	{
		System.out.println("Car---refuel");
	}
	
	public static void billing()
	{
		System.out.println("Car---Billing");
	}
	
	public static final void display()
	{
		System.out.println("Car--Display");
	}
	
	public final void running()
	{
		System.out.println("Car---Running");
	}
	
	public void payment(String cc, int cvv)
	{
		System.out.println("Car payment using" + cc +"and"+cvv);
	}
	public void payment(String upi)
	{
		System.out.println("Car payment using upi:" + upi);
	}
}
