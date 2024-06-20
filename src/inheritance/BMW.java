package inheritance;

public class BMW extends Car{
	
	@Override
	public void start()
	{
		System.out.println("BMW ---Start");
	}
	
	public void Autoparking()
	{
		System.out.println("BMW---Autoparking");
	}
	
	public static void billing()
	{
		System.out.println("BMW--Billing");
	}
	
  @Override
	public void payment(String cc, int cvv)
	{
		System.out.println("BMW payment using" + cc +"and"+cvv);
	}
	@Override
	public void payment(String upi)
	{
		System.out.println("BMW payment using upi:" + upi);
	}

}
