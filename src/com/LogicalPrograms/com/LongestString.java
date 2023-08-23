package com.LogicalPrograms.com;

import java.util.Arrays;

public class LongestString {

	public static void main(String[] args) {

		
//		Question :- Find longest string in given array.....
		
		String[] str = {"java","python","c++","html","java","c++","javascript"};
		String longest = Arrays.stream(str).reduce((word1, word2)->word1.length() > word2.length() ? word1:word2).get();
		System.out.println(longest);
		
		//output :- javascript
	}

}
