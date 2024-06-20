package OOP_Interface;

public class fortishospital extends Hospital implements USmedical, UKmedical, IndianMedical {
	
public void Nueroservices()
    {
	    System.out.println("FH---Nueroservices");
    }
	
	public void Physioservices()
	{
		System.out.println("FH---Physioservices");
	}
	
	public void Cardioservices()
	{
		System.out.println("FH---Cardioservices");
	}
	
    public void Dentalservices()
    {
	    System.out.println("FH---DentalServices");
    }
	
	public void Entservices()
	{
		System.out.println("FH---Entservices");
	}
	
    public void oncologyservices()
    {
    	System.out.println("FH---oncologyservices");
    }
	
	public void gynicservices()
	{
		System.out.println("FH---gynicservices");
	}
	
	public void orthoservices()
	{
		System.out.println("FH---orthoservices");
	}
	
	public void covidvaccination()
	{
		System.out.println("FH---covidvaccination");
	}
	
	public void childcareservices()
	{
		System.out.println("FH---Childcareservice");
	}
	
	public static void Taxcalculation()
	{
		System.out.println("FH- Tax calculation");
	}

	public static void main(String[] args)
	{
		fortishospital fh = new fortishospital();
		fh.Cardioservices();
		fh.Nueroservices();
		fh.Physioservices();
		fh.Dentalservices();
		fh.Entservices();
		fh.oncologyservices();
		fh.gynicservices();
		fh.orthoservices();
		fh.covidvaccination();
		fh.childcareservices();
		fh.medicalRD();
		fh.medicalNews();
		USmedical.Taxcalculation();
		fortishospital.Taxcalculation();
		System.out.println(fortishospital.min_fee);
		System.out.println(USmedical.min_fee);
		
		
		
	}
}
