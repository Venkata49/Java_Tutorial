package com.LogicalPrograms.com;

public class ReverseString {

	public static void main(String[] args) {

		String str = "abcd";
		String rev = " ";
		int len = str.length();

		for(int i=len-1;i>=0;i--)
			rev = rev+str.charAt(i);
		
		System.out.println(rev);
		
		
//		Using StringBuffer Method....
		
		StringBuffer sb  = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
