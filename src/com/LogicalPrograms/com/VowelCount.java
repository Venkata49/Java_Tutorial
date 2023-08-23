package com.LogicalPrograms.com;

import java.util.Arrays;
import java.util.List;

public class VowelCount {

	public static void main(String[] args) {

		
		String str = "venkatakumar";
		List<Character> vowels = Arrays.asList('a','e','i','o','u');
				str.chars()
				.mapToObj(c->(char)c)
				.filter(vowels::contains)
				.forEach(System.out::println);
		
	}

}
