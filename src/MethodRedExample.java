import java.util.ArrayList;
import java.util.List;

public class MethodRedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("TX");
		names.add("IL");
		names.add("CA");
		
		names.forEach(System.out::println);

	}

}
