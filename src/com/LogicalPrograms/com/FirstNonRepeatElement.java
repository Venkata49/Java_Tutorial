package com.LogicalPrograms.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {

	public static void main(String[] args) {
		
//		skip() & limit() Methods...are using in map() methods....
		
		String name = "helloworld";
		
		String list = Arrays.stream(name.split(""))
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				 .entrySet().stream()
				 .filter(s->s.getValue()==1)
				 .findFirst().get().getKey();
		System.out.println(list);
		
	}

}
