
public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Tet Run");
		
		Runnable roar=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("Runing 1");
				
				
			}
		};
		
		Runnable roar1 = () -> System.out.println("Running 2");
		
		roar.run();
		roar1.run();

	}

}
