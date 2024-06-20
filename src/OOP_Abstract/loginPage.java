package OOP_Abstract;

public class loginPage extends Page {

	@Override
	public void title()
	{
		System.out.println("LP--Title");	
	}

	@Override
	public void url() 
	{
		System.out.println("LP--Url");	
	}
	
	public void resetpwd()
	{
		System.out.println("LP--reset PWD");
	}
	
	public static void pagecycle()
	{
		System.out.println("LP---Pagecycle");
	}
	
	public void pageLoadingTime()
	{
		System.out.println("Page loading time 5 seconds");
	}

}
