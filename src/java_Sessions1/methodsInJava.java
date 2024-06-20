package java_Sessions1;

public class methodsInJava {
public void test()
{
	int a=20;
	int b=30;
	
	System.out.println("sum:"+(a+b));
}

public int getBillAmount()
{
	int foodbills = 100;
	int drinkbills = 50;
	int totalbills = foodbills + drinkbills;
	return totalbills;
}

public String getEmployeeName()
{
	System.out.println("Get emp name");
	String name = "Naveen";
	return name;
}

public void getSum(int c, int d)
{
	System.out.println("getsum:" + (c+d));
}

public double getMultiplication(int e, double f)
{
	double mul = e*f;
	return mul;
}



public static void main(String[] args)
{
	methodsInJava t = new methodsInJava();
	t.test();
	
	int tb = t.getBillAmount();
System.out.println("totalbills:"+tb);

String empname = t.getEmployeeName();
System.out.println(empname);

t.getSum(70, 80);
double d = t.getMultiplication(50, 40.35);
System.out.println(d);
}
}
