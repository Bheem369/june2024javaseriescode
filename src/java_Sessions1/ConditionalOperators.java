package java_Sessions1;

public class ConditionalOperators {
	
	public static void main(String[] args)
	{
		int a = 100;
		int b = 120;
		
		if(a==b)
		{
			System.out.println("a is equal to b");
		}
		else
		{
			System.out.println("a is not equal to b");
		}
		
		if(a>=b)
		{
			System.out.println("a is greater than b");
		}
		
		else
		{
			System.out.println("a is less than b");
		}
		
		int total = 500;
		if(total!=500)
		{
			System.out.println("Bye");
		}
		else
		{
			System.out.println("Hi");
		}
		
		int marks = 100;
		if(marks<=100)
		{
			System.out.println("Valid marks");
		}
		if(marks>=90)
		{
			System.out.println("A grade");
			if(marks>=95)
			{
			System.out.println("Eligible of scholarship");
			if(marks==100)
			{
				System.out.println("Fees waived off");
			}
			}
		}
		
		else if(marks>=80)
		{
			System.out.println("B grade");
		}
		else
		{
			System.out.println("Fail");
		}
		
		String browser = "Edge";
		if(browser.equals("chrome"))
		{
			System.out.println("chrome is launched");
		}
		if(browser.equals("firefox"))
		{
			System.out.println("firefox is launched");
		}
		if(browser.equals("edge"))
		{
			System.out.println("edge is launched");
		}
			
	}

}
