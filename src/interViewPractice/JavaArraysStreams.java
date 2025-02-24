package interViewPractice;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class JavaArraysStreams {
	
	
	//Fetch all the numbers greater than 5

	public void q1()
	{
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> result=numbers.stream().filter(n->n>5).collect(Collectors.toList());
		System.out.println(result);
	}
	
	
	//find the largest Element from an array
	@Test
	public void q2() {
		int Largest=1;
		List<Integer> numbers=Arrays.asList(1,20,3,4,5,6,7,80,9);
		List<Integer> result=numbers.stream().filter(n->n>Largest).collect(Collectors.toList());
		int LargestNum=numbers.stream().filter(n->n>n).findFirst().get();
		System.out.println(LargestNum);
		
		
		
		

		
	}

}
