package exceptionhandling;

public class Driverfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String browser = null;
            
            if(browser == null)
            {
            	try
            	{
            		throw new Exception("browser not found");
            	}
            	catch(Exception e)
            	{
            		e.printStackTrace();
            	}
            	
            }
            else
            {
            	System.out.println("browser is launched");
            }
	}

}
