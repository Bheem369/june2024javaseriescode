package exceptionhandling;

public class Employee {
	
	String name;

	public static void main(String[] args) {
         System.out.println("A");
         System.out.println("A");
         
         try {
        	 
        Employee obj = new Employee();
       // obj = null;
        obj.name = "Naveen";
         int i = 9/0;
         System.out.println("Hello");
         }
         
         catch(NullPointerException e)
         {
       	 
        	 e.printStackTrace();
        }
         
         catch(ArithmeticException e)
         {
        	 System.out.println("AE is coming");
        	 e.printStackTrace();
         }
         
         
         System.out.println("Bye");
	}

}
