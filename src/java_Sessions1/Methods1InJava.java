package java_Sessions1;

public class Methods1InJava {
	public int getStudentMarks(String studentName) {
		int marks= -1;
		String b = studentName.toLowerCase().trim();
		
		if(b.equals("naveen"))
		{
			marks = 100;
		}
		
		else if(b.equals("rashmi"))
		{
			marks = 90;
		}
		
		else if(b.equals("ravi"))
		{
			marks = 80;
		}
		
		else
		{
			System.out.println("student name not found");
		}
		
		return marks;
			
	}
	
	public static void main (String[] args)
	{
		Methods1InJava obj = new Methods1InJava();
		int m = obj.getStudentMarks(" RAVI");
		System.out.println("Student marks:"+ m);
	}
}


