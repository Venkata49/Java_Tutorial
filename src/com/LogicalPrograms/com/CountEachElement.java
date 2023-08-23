package com.LogicalPrograms.com;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElement {

	public static void main(String[] args) {
		
//		Question :- Count each element in given string...

		String name = "helloworld";
		
		Map<String, Long> map1 = Arrays.stream(name.split(""))
								 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map1);
		
//		Output :- {a=3, r=1, t=1, u=1, e=1, V=1, k=2, m=1, n=1}

		
	}

}
