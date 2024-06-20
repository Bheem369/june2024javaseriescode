package java_Sessions1;

public class SwitchCaseConcept {
	public static void main(String[] args)
	{
		String browser = "chrome";
		switch(browser)
		{
		case "chrome":
		{
			System.out.println("chrome is launched");
			break;
		}
		case "firefox":
		{
			System.out.println("firefox is launched");
			break;
		}
		case "edge":
		{
			System.out.println("edge is launched");
			break;
		}
		default :
		{
			System.out.println("Invalid browser");
			break;
		}
		}
	}

}
