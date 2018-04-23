import java.awt.print.Printable;

public class DefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car cars= new Car();
		cars.Print();

	}
}
	
	
	interface vehicle{
		default void Print() {
			
			System.out.println("I am vehicle");
			
		}
	}
	
	interface Bike{
		default void Print() {
			
			System.out.println("I am Bike");
			
		}
	}
	
	class Car implements vehicle,Bike {
		
		public void Print() {
			vehicle.super.Print();
			Bike.super.Print();
			System.out.println("Hello This is Car");
		}
		
	}


