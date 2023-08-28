package com.LogicalPrograms.com;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "welcome to java programming";
		String[] words = str.split(" "); //Splitting string into words...
		String reverse = "";
		for(String w : words){ // 'welcome' word first executed
			String reversWord = "";
			for(int i=w.length()-1;i>=0;i--){
				reversWord = reversWord+w.charAt(i);
			}
			reverse = reverse+reversWord+" ";//emoclew
		}
		System.out.println(reverse); 	//output :- emoclew ot avaj gnimmargorp 

		
	}

}
