package java_Sessions1;

public class methodOverloading {
	
	public void test()
	{
		System.out.println("No values given");
	}
	
	public void test(int i)
	{
		System.out.println(" value of i:" +i);
	}

	public void test(String name , int i){
		{
			System.out.println("Name:" +name + " i:"+i);
		}
	}
		
		public static void main(String[] args)
		{
			methodOverloading m = new methodOverloading();
			m.test();
			m.test(20);
			m.test("naveen", 30);
			
		}
}
