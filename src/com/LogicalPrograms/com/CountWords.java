package com.LogicalPrograms.com;

public class CountWords {

	public static void main(String[] args) {

		
		String str = "welcome to java programming";
		int count =1;
		for(int i=0;i<str.length()-1;i++){
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
			{
				count++;
			}
			
		}
		System.out.println("Count of the words are :"+ count);	//Output :- Count of the words are :4

	}

}
