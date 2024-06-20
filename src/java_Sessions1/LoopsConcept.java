package java_Sessions1;

public class LoopsConcept {
	public static void main(String[] args)
	{
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println(i);
//			++i;
//		}
		
//		int num = 1;
//		while(num<=100)
	//	{
	//		if(num%5==0)
	//		{
	//			System.out.println(num +" is divisible by 5");
	//		}
	//		else
	//		{
	//			System.out.println(num +" is not divisble 5");
		//	}
		//	num++;
		int i;
		for(i=1; i<=15; i++)
		{
			if(i%5==0)
			{
				System.out.println(i+" is divisible by 5");
			}
			else
			{
				System.out.println(i+" is not divsible by 5");
				
			}
			
		}
		System.out.println(" ");
		for(char c= 'a'; c<='z'; c++)
		{
			System.out.println((int)c + ":" + c);
		}
	//for(String s = "naveen";s.equals("naveen");)
	//{
	//	System.out.println("Hi");
		
	//}
		int p=1;
		do {
			System.out.println(p);
			p++;
		}
		while(p<=10);
			
			
			
	
	}

}
