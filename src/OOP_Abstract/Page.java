package OOP_Abstract;

public abstract class Page {
	
	public abstract void title();
	
	public abstract void url();
	
	public void displaylogo()
	{
		System.out.println("Page--Logo");
	}
	
	public void pageLoadingTime()
	{
		System.out.println("Page loading time 10 seconds");
	}
	
	public static void pagecycle()
	{
		System.out.println("Page---Pagecycle");
	}

}
