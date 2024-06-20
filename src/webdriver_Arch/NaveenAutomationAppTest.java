package webdriver_Arch;

public class NaveenAutomationAppTest {

	public static void main(String[] args) {
		
		String browser = "chrome";
		Webdriver driver = null;
		
		if (browser.equals("chrome"))
		{
			driver = new chromedriver();
		}
		
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("safari"))
		{
			driver = new SafariDriver();
		}
		
		else
		{
			System.out.println("No browser is launched");
		}
		
		  
		driver.get("https://www.naveenautomationlabs.com");
		
		String actualtitle = driver.getTitle();
		System.out.println("actualtitle =" + actualtitle);
		
		driver.findelement("loginbtn");
		
		driver.sendKeys("username", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginbtn");
		
		driver.close();
		

	}

}
