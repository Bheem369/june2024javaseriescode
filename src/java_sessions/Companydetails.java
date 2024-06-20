package java_sessions;

public class Companydetails {

	public static void main(String[] args) {
		Company cy = new Company("naveen", 1000, 90);
		
		System.out.println(cy.getName());
		System.out.println(cy.getEmpcount());
		System.out.println(cy.getShareprice());

	}

}
