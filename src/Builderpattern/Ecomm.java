package Builderpattern;

public class Ecomm {

	public Ecomm login()
	{
		System.out.println("login");
		return this;
	}
	
	public Ecomm login(String un , String pwd)
	{
		System.out.println("username:" +un + " " + "password: "+ pwd);
		return this;
	}
	
	public Ecomm dosearch(String productname, int price, String brand)
	{
		System.out.println(productname+" "+price+" "+brand);
		return this;
	}
	
	public Ecomm addToCart(String productname)
	{
		System.out.println(productname);
		return this;
	}
	
	public Ecomm doPayment(String cc , int cvv)
	{
		System.out.println(cc + ""+ cvv);
		return this;
	}
    public Ecomm generateOrder(String no)
   {
    	System.out.println(no);
    	return this;
   }
    public Ecomm logout()
    {
    	System.out.println("logout");
    	return this;
    }
  
  
}
