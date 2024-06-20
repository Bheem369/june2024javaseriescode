package java_sessions;

public class constructor {
	
	String name;
	int age;
	String email;
	String password;
	String phoneno;
	
	public constructor(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public constructor(String name, int age, String email)
	{
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public constructor(String name, int age, String email, String password)
	{
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	
	public constructor(String name, int age, String email, String password, String phoneno)
	{
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
	}
	
	public static void main(String[] args)
	{
		constructor c1 = new constructor("naveen", 40);
		System.out.println(c1.name);
		System.out.println(c1.age);

		
		constructor c2 = new constructor("priya", 39 , "naveenqa@gmail.com" , "naveen369", "9848310560");
	    System.out.println(c2.name);
		System.out.println(c2.age);	
		System.out.println(c2.email);
		System.out.println(c2.password);
		System.out.println(c2.phoneno);
		
	
	
	
	}
}
