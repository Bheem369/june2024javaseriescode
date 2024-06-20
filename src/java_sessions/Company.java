package java_sessions;

public class Company {
	
	private String name;
	private int empcount;
	private int shareprice;
	
	public Company(String name, int empcount, int shareprice)
	{
		this.name = name;
		this.empcount = empcount;
		this.shareprice = shareprice;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpcount() {
		return empcount;
	}

	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}

	public int getShareprice() {
		return shareprice;
	}

	public void setShareprice(int shareprice) {
		this.shareprice = shareprice;
	}
	
	
	

}
