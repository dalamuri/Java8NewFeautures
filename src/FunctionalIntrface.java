import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalIntrface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(lst);
		
		evaluate(lst, n -> n%2 == 0);

	}

	private static void evaluate(List<Integer> lst, Predicate<Integer> object) {
		// TODO Auto-generated method stub
		
		for(Integer n :lst) {
			if (object.test(n)) {
				System.out.println(n);
				
			}
		}
		
	}

}
