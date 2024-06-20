package OOP_Interface;

public interface USmedical extends WHO, USHG{
	
	int min_fee = 10;
	
	public void Nueroservices();
	
	public void Physioservices();
	
	public void Cardioservices();
	
	@Override
	public void covidvaccination();
	
	public static void Taxcalculation()
	{
		System.out.println("US- Tax calculation");
	}
	
	default void getMedicalServies()
	{
		System.out.println("US - getMedicalServices");
	}

}
