package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lStrings = Arrays.asList("s1","","s2","s3","","s4");

		System.out.println("List : " +lStrings);
	
		//using Streams
		
		List<String> s1 = lStrings.stream().filter(string -> (! string.isEmpty())).collect(Collectors.toList());
		System.out.println(s1);
	}

}
