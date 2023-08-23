package com.LogicalPrograms.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingElementWith {

	public static void main(String[] args) {

		
		int[] arr = {2,3,4,5,221,434,54,444,39,878,787,76};
		List<String> startWith = Arrays.stream(arr)
		.boxed()
		.map(s->s+"")
		.filter(x->x.startsWith("7"))
		.collect(Collectors.toList());
		System.out.println(startWith);	//output :- [787, 76]

	}

}
