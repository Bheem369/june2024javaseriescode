package Builderpattern;

public class ecomm_main {
	

	public static void main(String[] args) {
		
         Ecomm e1 = new Ecomm();
         e1.login("naveen", "shankar").dosearch("trimmer", 1000, "philips").generateOrder("123456");
	}

}
