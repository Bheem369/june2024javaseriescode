package Builderpattern;

public class Employee {
	
	String name;
	int age;
	
	public int add(int a, int b) 
	{
		System.out.println("sum of 2 numbers");
		int sum = a+b;
		return sum;
	}
	
	public void getEmpinfo(Employee emp)
	{
		emp.name = "Amritha";
		emp.age = 20;
		System.out.println(emp.name + " " + emp.age);
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.name = "Gaurav";
		e1.age = 30;
		
		System.out.println(e1.name + " " + e1.age);
		
		e1.getEmpinfo(e1);
		
		System.out.println(e1.name + " " + e1.age);
		
		
		
		

	}

}
