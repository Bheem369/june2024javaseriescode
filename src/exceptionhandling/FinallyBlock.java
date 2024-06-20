package exceptionhandling;

public class FinallyBlock {
	

	public static void main(String[] args) {
        System.out.println("hi");
   
        
        try {
       	    int i = 9/0;
        }
        
        catch(ArithmeticException e)
        {
        	System.out.println("AE is coming");
        	e.printStackTrace();
        }
        
        finally
        {
        	System.out.println("Finally block...");
        }
        
        System.out.println("Bye");
 

}
}
