package com.LogicalPrograms.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		
//		Question :- Count each character in given string...
			
	String name = "helloworld";
	String arr[] = name.split("");
	
	Map<String,List<String>> map = Arrays.stream(arr).collect(Collectors.groupingBy(s->s));
	System.out.println(map);
	
//	Output :- {a=[a, a, a], r=[r], t=[t], u=[u], e=[e], V=[V], k=[k, k], m=[m], n=[n]}

	
		
	}

}
