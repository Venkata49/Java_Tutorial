package com.LogicalPrograms.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSecondHighestNumber {

	public static void main(String[] args) {

		int[] num = {5,4,3,2,6,8,6,9,22};
		
		List<Integer> integer = Arrays.stream(num).boxed()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		System.out.println(integer);	 //[22, 9, 8, 6, 6, 5, 4, 3, 2]
		

		
//		Question :- Print Second Highest Number in Array....
		
		Integer SecondHighestNumber = Arrays.stream(num).boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().get();
		System.out.println(SecondHighestNumber);	//output :- 9
	}

}
