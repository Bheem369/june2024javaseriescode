package webdriver_Arch;

public class SafariDriver implements Webdriver{
	
	public SafariDriver()
	{
		System.out.println("Safaribrowser is launched");
	}
	
	@Override
	public void findelement(String element) {
		System.out.println("Find element:" + element);
		
	}

	@Override
	public void get(String url) {
		System.out.println("Enter url:" + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Getting Page title:" );
		return "Naveen automation Labs";
	}

	@Override
	public void click(String element) {
		
		System.out.println("Clicking on element" + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Enter value" + value + "into" + element);
		
	}

	@Override
	public void close() {
		System.out.println("closing Browser");
		
	}

}
