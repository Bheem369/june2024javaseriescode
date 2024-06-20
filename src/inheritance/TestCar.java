package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		b1.start();
		b1.stop();
        b1.refuel(); 
        b1.Autoparking();
        BMW.display();
        b1.running();
        BMW.billing();
        b1.payment("3456786", 766);
        b1.payment("naveen@ibl");
        System.out.println("-----");
        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();
        
        System.out.println("------");
        Car c1 = new BMW();
        c1.start();
        c1.stop();
        c1.refuel();
        Car.billing();
        c1.payment("3456123", 768);
        c1.payment("yamini@ibl");
        
	}

}
