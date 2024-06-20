package java_sessions;

public class testemp {
	
public static void main(String[] args)
{
	Encapsulation e = new Encapsulation();
	e.name = "naveen";
	e.age = 40;
	e.setSalary(40000);
	
	System.out.println(e.name);
	System.out.println(e.age);
	System.out.println(e.getSalary());
	
}
}
