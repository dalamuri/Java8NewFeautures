
public class Lambda3 {

	final static String greeting = "Hey!";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingService gst= msg -> System.out.println(greeting +msg);
		gst.greet(" Sougandh. ");
		

	}
	
	interface GreetingService {
		
		void greet(String msg);
		
	}

}
