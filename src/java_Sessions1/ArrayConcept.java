package java_Sessions1;

import java.util.Arrays;

public class ArrayConcept {
	public static void main(String[] args)
	{
		int a[] = new int[4];
		
		System.out.println("Array length: "+ a.length);
		int l1= 0;
		int h1 = a.length-1;
		
		System.out.println("lower index: "+l1);
		System.out.println("higher index: " +h1);
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		for(int k=0; k<=3; k++)
		{
			System.out.println("Array value "+"a"+"["+k+"]"+": "+ a[k]);
		}
		
System.out.println(Arrays.toString(a));
for(int e:a)
{
	System.out.println(e);
}

double d[] = new double[2];
d[0]= 12;
d[1]=15.678;
for(int j=0; j<=1; j++)
{
	System.out.println("Array value "+"d"+"["+j+"]"+": "+ d[j]);
}	
Object o[] = new Object[5];
o[0] = "Naveen";
o[1] = 28;
o[2] = 30000;
o[3] = 'M';
o[4] = true;
for(Object e:o)
{
	System.out.println(e);
}
Object data[] = {"shankar", 45000, 'm', false};
		for(Object e: data)
		{
			System.out.println(e);
		}
	}
	

}
