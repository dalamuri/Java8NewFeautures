import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> places = new ArrayList<String>();
		places.add("One");
		places.add("Two");
		places.add("Three");
		places.add("Hello");
		
		JavaSort jSort=new JavaSort();
		jSort.sortWithJava7(places);
		
		System.out.println(places);
		
		places.add("Hahaha");
		
		jSort.sortWithJava8(places);
		
		System.out.println(places);
		

	}

	private void sortWithJava8(List<String> places) {
		// TODO Auto-generated method stub
		
		Collections.sort(places, (o1,o2) -> o1.compareTo(o2) );
		
		
	}

	private void sortWithJava7(List<String> places) {
		// TODO Auto-generated method stub
		Collections.sort(places, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		
		
		});
		
		
	}

}
